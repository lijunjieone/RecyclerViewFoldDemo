package org.cgsdream.demo

/**
 * Created by cgspine on 2018/1/26.
 */

data class Header(val id:Int,val title: String) : Cloneable<Header> {
    override fun clone(): Header {
        return Header(id,title)
    }

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Header) {
            return false
        }

        return other.id == id
    }
}

data class Item(val id:Int,val parentId:Int,val content: String) : Cloneable<Item> {
    override fun clone(): Item {
        return Item(id,parentId,content)
    }

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Item) {
            return false
        }

        return other.id == id
    }
}


data class GroupItem(val id:Int,val content:String) {

}

