package com.payment.pramod

import android.app.Application
import com.paypal.checkout.PayPalCheckout
import com.paypal.checkout.config.CheckoutConfig
import com.paypal.checkout.config.Environment
import com.paypal.checkout.config.SettingsConfig
import com.paypal.checkout.createorder.CurrencyCode
import com.paypal.checkout.createorder.UserAction

class App : Application() {

    var clientID = "AeK6SPm43LOKPJVB-Hg7TKf-MIrzjR1uUK5DBWiqeRRtjn2WPOFQSl1EGxpJjEKK9m8ZfxWd4RnkH9iW"
    var returnUrl = "com.payment.pramod://paypalpay"
   // const val Secretkey ="EIa0ahQ5WFwtCScy2zPzwBrlaluo2IHR2oLV9UAOB72V3tZBGczg7VLrnaJ2TBS_EIPflFLAQDVwT0u3"



    override fun onCreate() {
        super.onCreate()

        val config = CheckoutConfig(
            application = this,
            clientId = clientID,
            environment = Environment.SANDBOX,
            returnUrl = returnUrl,
            currencyCode = CurrencyCode.USD,
            userAction = UserAction.PAY_NOW,
            settingsConfig = SettingsConfig(
                loggingEnabled = true
            )
        )
        PayPalCheckout.setConfig(config)
    }

}