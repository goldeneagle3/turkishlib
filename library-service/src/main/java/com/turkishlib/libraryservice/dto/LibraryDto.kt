package com.turkishlib.libraryservice.dto

data class LibraryDto @JvmOverloads constructor(
        val id: String,
        val userBookList: List<BookDto>? = ArrayList()
) {

}