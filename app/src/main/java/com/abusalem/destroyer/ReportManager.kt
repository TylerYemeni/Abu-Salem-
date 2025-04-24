// ReportManager.kt
package com.abusalem.destroyer

object ReportManager {
    fun logReport(target: String, identity: String, success: Boolean) {
        // هنا يتم تسجيل البلاغات
        if (success) {
            println("تم الإبلاغ عن الرقم $target بنجاح باستخدام الهوية $identity.")
        } else {
            println("فشل الإبلاغ عن الرقم $target.")
        }
    }
}
