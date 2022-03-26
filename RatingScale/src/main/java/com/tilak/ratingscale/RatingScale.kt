package com.tilak.ratingscale

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import androidx.annotation.DrawableRes
import androidx.appcompat.widget.AppCompatImageView
import androidx.constraintlayout.widget.ConstraintLayout
import com.tilak.ratingscale.models.RatingItem

class RatingScale : ConstraintLayout {

    private lateinit var ratingItems: Array<RatingItem>
    private var currentRating = -1
    private lateinit var item1: AppCompatImageView
    private lateinit var item2: AppCompatImageView
    private lateinit var item3: AppCompatImageView
    private lateinit var item4: AppCompatImageView
    private lateinit var item5: AppCompatImageView
    private lateinit var item6: AppCompatImageView
    private lateinit var item7: AppCompatImageView
    private lateinit var item8: AppCompatImageView
    private lateinit var item9: AppCompatImageView
    private lateinit var item10: AppCompatImageView

    @DrawableRes
    private var selectedItem1: Int = -1

    @DrawableRes
    private var selectedItem2: Int = -1

    @DrawableRes
    private var selectedItem3: Int = -1

    @DrawableRes
    private var selectedItem4: Int = -1

    @DrawableRes
    private var selectedItem5: Int = -1

    @DrawableRes
    private var selectedItem6: Int = -1

    @DrawableRes
    private var selectedItem7: Int = -1

    @DrawableRes
    private var selectedItem8: Int = -1

    @DrawableRes
    private var selectedItem9: Int = -1

    @DrawableRes
    private var selectedItem10: Int = -1

    @DrawableRes
    private var unSelectedItem1: Int = -1

    @DrawableRes
    private var unSelectedItem2: Int = -1

    @DrawableRes
    private var unSelectedItem3: Int = -1

    @DrawableRes
    private var unSelectedItem4: Int = -1

    @DrawableRes
    private var unSelectedItem5: Int = -1

    @DrawableRes
    private var unSelectedItem6: Int = -1

    @DrawableRes
    private var unSelectedItem7: Int = -1

    @DrawableRes
    private var unSelectedItem8: Int = -1

    @DrawableRes
    private var unSelectedItem9: Int = -1

    @DrawableRes
    private var unSelectedItem10: Int = -1

    lateinit var attributes: TypedArray


    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(attrs)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    ) {
        init(attrs)
    }

    private fun init(attrs: AttributeSet? = null) {
        inflate(context, R.layout.layout_rating_bar, this)
        attributes = context.obtainStyledAttributes(attrs, R.styleable.RatingScale)
        selectedItem1 = attributes.getResourceId(
            R.styleable.RatingScale_selectedRatingItem1,
            R.drawable.one_sel
        )
        selectedItem2 = attributes.getResourceId(
            R.styleable.RatingScale_selectedRatingItem2,
            R.drawable.two_sel
        )
        selectedItem3 = attributes.getResourceId(
            R.styleable.RatingScale_selectedRatingItem3,
            R.drawable.three_sel
        )
        selectedItem4 = attributes.getResourceId(
            R.styleable.RatingScale_selectedRatingItem4,
            R.drawable.four_sel
        )
        selectedItem5 = attributes.getResourceId(
            R.styleable.RatingScale_selectedRatingItem5,
            R.drawable.five_sel
        )
        selectedItem6 = attributes.getResourceId(
            R.styleable.RatingScale_selectedRatingItem6,
            R.drawable.six_sel
        )
        selectedItem7 = attributes.getResourceId(
            R.styleable.RatingScale_selectedRatingItem7,
            R.drawable.seven_sel
        )
        selectedItem8 = attributes.getResourceId(
            R.styleable.RatingScale_selectedRatingItem8,
            R.drawable.eight_sel
        )
        selectedItem9 = attributes.getResourceId(
            R.styleable.RatingScale_selectedRatingItem9,
            R.drawable.nine_sel
        )
        selectedItem10 = attributes.getResourceId(
            R.styleable.RatingScale_selectedRatingItem10,
            R.drawable.ten_sel
        )

        unSelectedItem1 = attributes.getResourceId(
            R.styleable.RatingScale_unSelectedRatingItem1,
            R.drawable.one_unsel
        )

        unSelectedItem2 = attributes.getResourceId(
            R.styleable.RatingScale_unSelectedRatingItem2,
            R.drawable.two_unsel
        )
        unSelectedItem3 = attributes.getResourceId(
            R.styleable.RatingScale_unSelectedRatingItem3,
            R.drawable.three_unsel
        )
        unSelectedItem4 = attributes.getResourceId(
            R.styleable.RatingScale_unSelectedRatingItem4,
            R.drawable.four_unsel
        )
        unSelectedItem5 = attributes.getResourceId(
            R.styleable.RatingScale_unSelectedRatingItem5,
            R.drawable.five_unsel
        )
        unSelectedItem6 = attributes.getResourceId(
            R.styleable.RatingScale_unSelectedRatingItem6,
            R.drawable.six_unsel
        )
        unSelectedItem7 = attributes.getResourceId(
            R.styleable.RatingScale_unSelectedRatingItem7,
            R.drawable.seven_unsel
        )
        unSelectedItem8 = attributes.getResourceId(
            R.styleable.RatingScale_unSelectedRatingItem8,
            R.drawable.eight_unsel
        )
        unSelectedItem9 = attributes.getResourceId(
            R.styleable.RatingScale_unSelectedRatingItem9,
            R.drawable.nine_unsel
        )
        unSelectedItem10 = attributes.getResourceId(
            R.styleable.RatingScale_unSelectedRatingItem10,
            R.drawable.ten_unsel
        )

        setupViewsWithIds()
    }

    private fun setupViewsWithIds() {
        item1 = findViewById(R.id.item1)
        item2 = findViewById(R.id.item2)
        item3 = findViewById(R.id.item3)
        item4 = findViewById(R.id.item4)
        item5 = findViewById(R.id.item5)
        item6 = findViewById(R.id.item6)
        item7 = findViewById(R.id.item7)
        item8 = findViewById(R.id.item8)
        item9 = findViewById(R.id.item9)
        item10 = findViewById(R.id.item10)
    }

    override fun onFinishInflate() {
        super.onFinishInflate()

        ratingItems = arrayOf(
            RatingItem(R.id.item1, unSelectedItem1, selectedItem1),
            RatingItem(R.id.item2, unSelectedItem2, selectedItem2),
            RatingItem(R.id.item3, unSelectedItem3, selectedItem3),
            RatingItem(R.id.item4, unSelectedItem4, selectedItem4),
            RatingItem(R.id.item5, unSelectedItem5, selectedItem5),
            RatingItem(R.id.item6, unSelectedItem6, selectedItem6),
            RatingItem(R.id.item7, unSelectedItem7, selectedItem7),
            RatingItem(R.id.item8, unSelectedItem8, selectedItem8),
            RatingItem(R.id.item9, unSelectedItem9, selectedItem9),
            RatingItem(R.id.item10, unSelectedItem10, selectedItem10)
        )

        item1.setOnClickListener {
            currentRating = 1
            updateDrawablesOnSelection()
        }

        item2.setOnClickListener {
            currentRating = 2
            updateDrawablesOnSelection()
        }

        item3.setOnClickListener {
            currentRating = 3
            updateDrawablesOnSelection()
        }

        item4.setOnClickListener {
            currentRating = 4
            updateDrawablesOnSelection()
        }

        item5.setOnClickListener {
            currentRating = 5
            updateDrawablesOnSelection()
        }

        item6.setOnClickListener {
            currentRating = 6
            updateDrawablesOnSelection()
        }

        item7.setOnClickListener {
            currentRating = 7
            updateDrawablesOnSelection()
        }

        item8.setOnClickListener {
            currentRating = 8
            updateDrawablesOnSelection()
        }

        item9.setOnClickListener {
            currentRating = 9
            updateDrawablesOnSelection()
        }

        item10.setOnClickListener {
            currentRating = 10
            updateDrawablesOnSelection()
        }

        item1.setImageResource(unSelectedItem1)
        item2.setImageResource(unSelectedItem2)
        item3.setImageResource(unSelectedItem3)
        item4.setImageResource(unSelectedItem4)
        item5.setImageResource(unSelectedItem5)
        item6.setImageResource(unSelectedItem6)
        item7.setImageResource(unSelectedItem7)
        item8.setImageResource(unSelectedItem8)
        item9.setImageResource(unSelectedItem9)
        item10.setImageResource(unSelectedItem10)

        setRating(attributes.getInteger(R.styleable.RatingScale_rating, 0))
    }

    fun setRating(rating: Int) {
        if (rating < 0 || rating > 10) {
            return
        }
        currentRating = rating
        updateDrawablesOnSelection()
    }

    fun getRating(): Int {
        return currentRating
    }

    private fun updateDrawablesOnSelection() {
        if (currentRating <= 0) {
            return
        }
        for (i in 0 until 10) {
            if (i <= currentRating - 1) {
                val id = ratingItems[i].id
                val selectedDrawable = ratingItems[i].selectedDrawable
                findViewById<AppCompatImageView>(id).setImageResource(selectedDrawable)
            } else {
                val id = ratingItems[i].id
                val unselectedDrawable = ratingItems[i].unselectedDrawable
                findViewById<AppCompatImageView>(id).setImageResource(unselectedDrawable)
            }
        }
    }
}