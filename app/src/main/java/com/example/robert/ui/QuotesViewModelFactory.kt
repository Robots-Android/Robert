package com.example.robert.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.robert.data.Quote
import com.example.robert.data.QuoteRepository
import com.example.robert.ui.qoutes.QuotesViewModel

// The same repository that's needed for QuotesViewModel
// is also passed to the factory
class QuotesViewModelFactory(private val quoteRepository: QuoteRepository)
    : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return QuotesViewModel(quoteRepository) as T
    }
}