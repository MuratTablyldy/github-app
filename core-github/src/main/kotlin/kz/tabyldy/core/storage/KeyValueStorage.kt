
package kz.tabyldy.core.storage

import com.russhwolf.settings.Settings
import com.russhwolf.settings.nullableBoolean
import com.russhwolf.settings.nullableString
import javax.inject.Inject

class KeyValueStorage @Inject constructor(settings: Settings) {

    var accessToken:String? by settings.nullableString(ACCESS_TOKEN)

    var isValid by settings.nullableBoolean(IS_VALID)

    companion object {
        const val ACCESS_TOKEN = "access_token"
        const val IS_VALID = "is_valid"
    }

}
