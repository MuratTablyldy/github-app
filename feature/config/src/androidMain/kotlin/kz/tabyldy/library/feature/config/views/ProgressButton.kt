package kz.tabyldy.library.feature.config.views

import android.content.Context
import android.content.res.Resources
import android.util.AttributeSet
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.widget.ProgressBar
import android.widget.RelativeLayout
import android.widget.TextView
import kz.tabyldy.githubapp.feature.config.R
import kz.tabyldy.githubapp.feature.config.databinding.SignInButtonBinding


class ProgressButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : RelativeLayout(context, attrs, defStyleAttr) {

    private val progressBar: ProgressBar

    private val buttonTextView: TextView

    private var _binding: SignInButtonBinding? = null

    private val binding: SignInButtonBinding
        get() = _binding!!


    init {
        _binding = SignInButtonBinding.inflate(LayoutInflater.from(context), this, true)
        buttonTextView = binding.buttonText
        progressBar = binding.progress
        loadAttr(attrs, defStyleAttr)
    }

    private fun loadAttr(attrs: AttributeSet?, defStyleAttr: Int) {
        val arr = context.obtainStyledAttributes(
            attrs,
            R.styleable.ProgressButton,
            defStyleAttr,
            0
        )

        val buttonText = arr.getString(R.styleable.ProgressButton_buttonText)
        val theme: Resources.Theme = context.theme
        val typedValue = TypedValue()
        theme.resolveAttribute(
            com.google.android.material.R.attr.colorOnPrimary, typedValue, true
        )
        val textColor = arr.getColor(R.styleable.ProgressButton_textColor, typedValue.data)
        arr.recycle()
        binding.buttonText.setTextColor(textColor)
        setText(buttonText)
    }

    fun setState(state: State){
        if(state== State.IDLE){
            isClickable = true
            isEnabled = true
            buttonTextView.visibility = View.VISIBLE
            progressBar.visibility = View.GONE
        } else {
            buttonTextView.visibility = View.GONE
            progressBar.visibility = View.VISIBLE
            isClickable = false
            isEnabled = false
        }
    }

    private fun setText(text: String?) {
        buttonTextView.text = text
    }

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        buttonTextView.isEnabled = enabled
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        _binding = null
    }
    enum class State{
        LOADING,IDLE
    }
}