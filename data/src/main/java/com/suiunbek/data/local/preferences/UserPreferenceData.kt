package com.suiunbek.data.local.preferences

class UserPreferenceData(
    private val preferenceHelper: PreferenceHelper
) {
    var userName: String?
        get() = preferenceHelper().getString(
            PreferenceConstants.USER_NAME, "null"
        )
        set(value) = preferenceHelper().edit().putString(
            PreferenceConstants.USER_NAME, value
        ).apply()

    var userAge: String?
        get() = preferenceHelper().getString(
            PreferenceConstants.USER_AGE, "null"
        )
        set(value) = preferenceHelper().edit().putString(
            PreferenceConstants.USER_AGE, value
        ).apply()

    var userEmail: String?
        get() = preferenceHelper().getString(
            PreferenceConstants.USER_EMAIL, "null"
        )
        set(value) = preferenceHelper().edit().putString(
            PreferenceConstants.USER_EMAIL, value
        ).apply()

    var userPassword: String?
        get() = preferenceHelper().getString(
            PreferenceConstants.USER_PASSWORD, "null"
        )
        set(value) = preferenceHelper().edit().putString(
            PreferenceConstants.USER_PASSWORD, value
        ).apply()
}