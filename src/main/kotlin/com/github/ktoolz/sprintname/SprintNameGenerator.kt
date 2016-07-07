/*
 * SprintName - KToolZ
 *
 * Copyright (c) 2016
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.github.ktoolz.sprintname

import java.util.*

/**
 * Maximum size the Sprint name can handle.
 */
val NAME_MAX_SIZE = 23

/**
 * A simple class allowing to generate Sprints names.
 *
 * Little story: We're working on an agile project using SCRUM, and are using Jira
 * for organizing our sprints. We're *always* struggling to find a good name for
 * our sprints, so we're having a little game for a while: our sprints are named
 * following the convention: one animal name & one plant name. As english is not
 * our native language, it's a good game to learn some new words in english :)
 * And it makes some fun names for our sprints.
 *
 * But... Finding animal names and plant names in english, and validating that
 * it's small enough to fit in the Jira field (which has a limited size) isn't the
 * funniest stuff ever.
 *
 * Soooo... We wrote that little piece of Kotlin code allowing to generate a sprint
 * name for us :)
 *
 * @author antoine
 */
class SprintNameGenerator() {
    /**
     * A list of animals names, coming from a text file read from the classpath
     */
    val animals = this.javaClass.getResourceAsStream("/animals.txt").bufferedReader().readLines()

    /**
     * A list of plants (vegetables and fruits), coming from a text file read from
     * the classpath
     */
    val plants = this.javaClass.getResourceAsStream("/plants.txt").bufferedReader().readLines()

    /**
     * Generates a sprint name composed of an animal name and a plant name,
     * matching with the restricted size of Jira.
     *
     * @return a sprint name with a valid size
     */
    fun generate(): String {
        val animal = animals[Random().nextInt(animals.size)]
        val plant = plants[Random().nextInt(plants.size)]
        val name = "$animal & $plant"
        if (name.length <= NAME_MAX_SIZE)
            return name
        else
            return generate()
    }
}

/**
 * Just the main function, which allows to actually generate some sprint names.
 * You can provide one argument which should match to the number of sprint names
 * you'd like to generate.
 *
 * @param [args] which can contain the number of names you'd like to generate.
 * If it's not the case, and you provide a bad parameter, we'll send just one
 * sprint name.
 */
fun main(args: Array<String>) {
    with(SprintNameGenerator()) {
        if (args.isNotEmpty()) {
            try {
                (0..args.first().toInt()).forEach { println(generate()) }
            } catch (e: NumberFormatException) {
                // It's just a simple tool, if the provided parameters are not ok, we'll
                // just display one sprint name, no particular error message.
                // Also as it might be scripted (calling the jar and retrieving the message)
                // We won't display information about command to use or anything.
                // People might just have the look at the README then to know how to use it ;)
                println(generate())
            }
        } else
            println(generate())
    }
}

