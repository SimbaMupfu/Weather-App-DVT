package inc.sims.hustles.weatherappdvt.models

import com.google.gson.annotations.SerializedName

data class TemperatureDetails(
    @SerializedName("min")
    val min: Double,
    @SerializedName("max")
    val max: Double,
)
