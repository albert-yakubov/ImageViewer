package com.example.imageviewer



//this is the class to store image data from retreived image
//contains Serializable at the end of class signature providing n
//necessary methods to intent.putExtra


import android.net.Uri

import java.io.Serializable



class ImageData(uriPhoto: Uri?): Serializable {
    var description: String? = null
    var uriToString: String? = uriPhoto.toString()







    fun getUriPath(): Uri {
        return Uri.parse(uriToString)

    }





}