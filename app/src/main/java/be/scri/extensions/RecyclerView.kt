/**
 * Adds a custom item decoration (divider) to a RecyclerView, using a specified drawable and custom margins.
 *
 * Copyright (C) 2024 Scribe
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package be.scri.extensions

import CustomDividerItemDecoration
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import androidx.recyclerview.widget.RecyclerView
import be.scri.R

fun RecyclerView.addCustomItemDecoration(context: android.content.Context) {
    val itemDecoration =
        CustomDividerItemDecoration(
            drawable = getDrawable(context, R.drawable.rv_divider)!!,
            width = 1,
            marginLeft = 50,
            marginRight = 50,
        )
    addItemDecoration(itemDecoration)
}
