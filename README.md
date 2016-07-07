# SprintName

[![Kotlin](https://img.shields.io/badge/kotlin-1.0.1-blue.svg)](http://kotlinlang.org) [ ![Download](https://api.bintray.com/packages/ktoolz/maven/sprintname/images/download.svg) ](https://bintray.com/ktoolz/maven/sprintname/_latestVersion) [![Build Status](https://travis-ci.org/ktoolz/sprintname.svg?branch=master)](https://travis-ci.org/ktoolz/sprintname)

Easiest tool ever for generating our sprints' names. Nothing fancy, just few lines of code :)

## But why?

Cause we always struggle to find a name for our sprints on Jira... So this little tool generates some names for us and let us learn some new words in english by displaying animals and plants names that we commonly don't know about :p

Why sharing it? There's no good reason for it, the real question was more: why not?

## How to use?

`java -jar sprintname.jar`

Yep, that's all.

You can (if you want) provide a parameter for the number of names you'd like if you need:

`java -jar sprintname.jar 5`

And it'll produce the names following the pattern `Animal & Plant`, by matching with the field length on Jira (I told you it was specific to our team :p).

## License

SprintName is released under the [MIT](http://opensource.org/licenses/MIT) license.

>The MIT License (MIT)

>Copyright (c) 2016

>Permission is hereby granted, free of charge, to any person obtaining a copy
>of this software and associated documentation files (the "Software"), to deal
>in the Software without restriction, including without limitation the rights
>to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
>copies of the Software, and to permit persons to whom the Software is
>furnished to do so, subject to the following conditions:

>The above copyright notice and this permission notice shall be included in
>all copies or substantial portions of the Software.

>THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
>IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
>FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
>AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
>LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
>OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
>THE SOFTWARE.
