package com.ascend.mapi.controller

import com.ascend.mapi.model.NotificationDataModel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/merchant")
class MerchantController {

    @GetMapping("/notification")
    fun getnotification() =
            NotificationDataModel(data = "data")

}