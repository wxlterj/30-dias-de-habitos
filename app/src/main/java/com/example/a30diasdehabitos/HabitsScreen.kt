package com.example.a30diasdehabitos

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30diasdehabitos.model.Habit
import com.example.a30diasdehabitos.ui.theme._30diasdehabitosTheme

@Composable
fun HabitCard(habit: Habit, dayNum: Int, modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }

    Card(modifier = modifier) {
        Column(
            modifier = Modifier
                .padding(12.dp)
                .clickable { expanded = !expanded }
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioNoBouncy,
                        stiffness = Spring.StiffnessMedium
                    )
                )
        ) {
            Text(
                text = stringResource(R.string.day, dayNum),
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier
                    .padding(bottom = 8.dp)
            )
            Text(
                text = stringResource(habit.nameRes),
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier
                    .padding(bottom = 8.dp)
            )
            Image(
                painter = painterResource(habit.imageRes),
                contentDescription = null
            )

            if (expanded) {
                Text(
                    text = stringResource(habit.descriptionRes),
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }
    }
}


@Preview
@Composable
fun HabitCardPreview() {
    _30diasdehabitosTheme {
        HabitCard(habit = Habit(R.string.habito_1, R.string.habito_description_1, R.drawable.habito1), 1)
    }
}

