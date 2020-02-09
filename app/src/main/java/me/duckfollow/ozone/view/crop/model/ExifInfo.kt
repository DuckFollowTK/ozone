package me.duckfollow.ozone.view.crop.model

class ExifInfo(var exifOrientation: Int, var exifDegrees: Int, var exifTranslation: Int) {

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false

        val exifInfo = o as ExifInfo?

        if (exifOrientation != exifInfo!!.exifOrientation) return false
        return if (exifDegrees != exifInfo.exifDegrees) false else exifTranslation == exifInfo.exifTranslation

    }

    override fun hashCode(): Int {
        var result = exifOrientation
        result = 31 * result + exifDegrees
        result = 31 * result + exifTranslation
        return result
    }

}
