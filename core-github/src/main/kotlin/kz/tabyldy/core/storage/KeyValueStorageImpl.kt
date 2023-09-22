
package kz.tabyldy.core.storage

import com.russhwolf.settings.Settings
import com.russhwolf.settings.nullableBoolean
import com.russhwolf.settings.nullableString
import kz.tabyldy.coreapi.storage.KeyValueStorage
import javax.inject.Inject

class KeyValueStorageImpl @Inject constructor(settings: Settings): KeyValueStorage
 {

     companion object {
         const val ACCESS_TOKEN = "access_token"
         const val IS_VALID = "is_valid"
     }

    override var accessToken:String? by settings.nullableString(ACCESS_TOKEN)

    override var isValid by settings.nullableBoolean(IS_VALID)

}
