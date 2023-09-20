package kz.tabyldy.library.feature.list.utils

import androidx.annotation.ColorRes
import kz.tabyldy.library.feature.list.R

enum class Language(@ColorRes val color: Int) {
    Java(R.color.java_color),
    Kotlin(R.color.kotlin_color),
    JavaScript(R.color.javascript_color),
    C(R.color.c_color),
    Python(R.color.python_color),
    Other(R.color.other_color);

    companion object {
        fun parseLanguage(language: String): Language {
            for (languageLocal in values()) {
                if (languageLocal.name == language) {
                    return languageLocal
                }
            }
            return Other
        }
    }

}

