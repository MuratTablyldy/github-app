package kz.tabyldy.githubapp.feature.detail.utils

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import com.robinhood.ticker.TickerUtils
import kz.tabyldy.githubapp.feature.detail.R
import kz.tabyldy.githubapp.feature.detail.databinding.CounterViewBinding


class CounterView(context: Context, attrs: AttributeSet?, defStyleAttr: Int) :
    LinearLayout(context, attrs, defStyleAttr) {
    constructor(context: Context) : this(context, null, 0)
    constructor(context: Context, attrs: AttributeSet) : this(context, attrs, 0)

    private var binding: CounterViewBinding? = null

    init {
        val inflater = LayoutInflater.from(context)
        binding = CounterViewBinding.inflate(inflater, this)
        CounterViewBinding.bind(binding!!.root)
        orientation = HORIZONTAL
        context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.CounterView,
            0,
            0
        ).apply {
            try {
                val resId = getResourceId(
                    R.styleable.CounterView_logo,
                    R.drawable.ic_baseline_star_24
                )
                val drawable = AppCompatResources.getDrawable(context, resId)
                val logoColor = getResourceId(R.styleable.CounterView_logoColor, R.color.other_color)
                binding?.ticker?.textColor = ContextCompat.getColor(context, logoColor)
                description = getString(R.styleable.CounterView_description)

                if (drawable != null) {
                    val tint = ContextCompat.getColor(context, logoColor)
                    DrawableCompat.setTint(drawable, tint)
                }
                logo = drawable
            } finally {
                recycle()
            }
        }
        binding?.ticker?.setCharacterLists(TickerUtils.provideNumberList())
    }

    private var logo: Drawable? = null
        set(value) {
            field = value
            binding?.logo?.setImageDrawable(value)
        }


    private var description: String? = ""
        set(value) {
            field = value
            binding?.description?.text = value
        }

    fun setNumber(number: String, animate: Boolean) {
        binding?.ticker?.setText(number, animate)
    }
}