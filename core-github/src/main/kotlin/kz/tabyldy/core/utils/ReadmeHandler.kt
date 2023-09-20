package kz.tabyldy.core.utils

import android.content.Context
import android.content.res.Resources.Theme
import com.youbenzi.mdtool.tool.MDTool
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL


object ReadmeHandler {

    private val budgeReg = """^(\[badge-.+]:)(.+)""".toRegex()

    private val codeReg = """\n?(<code>)(.+?)(</code>)""".toRegex()

    private val licenseReg = """\[!\[.+?]\((.+?)\).?]\((.+?)\)""".toRegex()

    suspend fun handle(url: String): String {
        return withContext(Dispatchers.IO) {
            val reader =
                BufferedReader(InputStreamReader(URL(url).openConnection().getInputStream()))
            val builder = StringBuilder()

            val data = reader.use {
                while (true) {
                    var string = reader.readLine() ?: break
                    string = string.replace("#", "")
                    when {

                        string.contains("![badge]", true) -> {
                            continue
                        }

                        string.contains(budgeReg) -> {
                          continue
                        }

                        string.contains(licenseReg) -> {
                         continue
                        }

                        else -> {
                            builder.append(string)
                            builder.append("\n")
                        }
                    }

                }
                builder.toString()
            }
            var html = MDTool.markdown2Html(data)
            builder.clear()
            html = html.replace(codeReg) { matchResult ->
                val matchContent = matchResult.groups[2]!!.value
                if (matchContent.length < 15) {
                    "<back>$matchContent</back>"
                } else {
                    "<div class=\"divScroll\"> $matchContent </div>"
                }
            }
            html = html.replace("<code>", "<div class=\"divScroll\">")
            html = html.replace("</code>", "</div>")
            val background = "#0D1117"
            val primaryColor = "#FFFFFFFF"
            val linkColor = "#58A6FF"
            builder.append(
                "<!DOCTYPE html><html>\n"
                        + "<head>\n"
                        + "<style>\n"
                        + ".divScroll {\n"
                        + "overflow-x:auto;}"
                        + "body {background-color:$background; color:grey;}\n"
                        + "h1 {color:$primaryColor;}"
                        + "h2 {color:$primaryColor;}"
                        + "h3 {color:$primaryColor;}"
                        + "h4 {color:$primaryColor;}"
                        + "h5 {color:$primaryColor;}"
                        + "h6 {color:$primaryColor;}"
                        + "strong {color:$primaryColor;}"
                        + " img {max-width:100%; height:auto}"
                        + "back {background-color:rgb(26, 30, 36); border-radius:5%;}"
                        + "a {color:$linkColor;}"
                        + "pre {background-color:rgb(26, 30, 36);}\n"
                        + "</style>" +
                        "\n</head>\n<body>\n"
            )

            builder.append(html)
            builder.append("</body>\n</html>")
            builder.toString()
        }
    }

}
