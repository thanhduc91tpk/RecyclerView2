package com.thanhduc91tpk.recyclerview2.model

import java.io.Serializable

class AlphaChar : Serializable{
    var icons:Int ? = 0
    var alpha:String ? = null
    var ratingbar : Double = 0.0

    constructor(icons: Int?, alpha: String?) {
        this.icons = icons
        this.alpha = alpha
    }
}