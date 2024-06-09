package classlar
data class GroupItem(
    val title: String,
    val children: List<ChildItem>
)
data class ChildItem(
    val imageResId: Int,
    val mainText: String,
    val subText: String,
    val link: String // New link property
)
