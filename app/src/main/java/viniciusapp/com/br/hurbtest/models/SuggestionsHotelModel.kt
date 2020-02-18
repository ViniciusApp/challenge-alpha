package viniciusapp.com.br.hurbtest.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class SuggestionsHotelModel: Serializable {
    @field:SerializedName("suggestions")
    var suggestions: List<SuggestionsModel>? = null
    @field:SerializedName("total")
    var total: Int? = null
    @field:SerializedName("search")
    var search: String? = null

}