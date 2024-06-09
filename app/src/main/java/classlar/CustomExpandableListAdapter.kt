package classlar

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.ImageView
import android.widget.TextView
import uz.javokhir_apps.onlaynlibrary.R
import uz.javokhir_apps.onlaynlibrary.book.BooksActivity

class CustomExpandableListAdapter(
    private val context: Context,
    private val groupList: List<GroupItem>,
    private val openPdf: (String) -> Unit
) : BaseExpandableListAdapter() {

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        return groupList[groupPosition].children[childPosition]
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return groupList[groupPosition].children.size
    }

    override fun getGroup(groupPosition: Int): Any {
        return groupList[groupPosition]
    }

    override fun getGroupCount(): Int {
        return groupList.size
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }

    override fun getChildView(
        groupPosition: Int, childPosition: Int, isLastChild: Boolean,
        convertView: View?, parent: ViewGroup?
    ): View {
        val childItem = getChild(groupPosition, childPosition) as ChildItem
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.child_item_layout, parent, false)
        val imageView = view.findViewById<ImageView>(R.id.childImage)
        val mainTextView = view.findViewById<TextView>(R.id.childMainText)
        val subTextView = view.findViewById<TextView>(R.id.childSubText)

        imageView.setImageResource(childItem.imageResId)
        mainTextView.text = childItem.mainText
        subTextView.text = childItem.subText

        view.setOnClickListener {
            openPdf(childItem.link)
        }

        return view
    }

    override fun getGroupView(
        groupPosition: Int, isExpanded: Boolean,
        convertView: View?, parent: ViewGroup?
    ): View {
        val groupItem = getGroup(groupPosition) as GroupItem
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.child_item_layout, parent, false)
        val groupTitle = view.findViewById<TextView>(R.id.groupTitle)
        groupTitle.text = groupItem.title

        return view
    }
}
