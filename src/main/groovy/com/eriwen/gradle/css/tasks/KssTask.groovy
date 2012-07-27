/**
 * Copyright 2012 Eric Wendelin
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.eriwen.gradle.css.tasks

import org.gradle.api.tasks.TaskAction
import com.eriwen.gradle.css.ResourceUtil
import com.eriwen.gradle.css.RhinoExec
import org.gradle.api.tasks.SourceTask
import org.gradle.api.tasks.OutputFile

class KssTask extends SourceTask {
    @OutputFile File dest

    @TaskAction
    def run() {
      // https://github.com/RobertFischer/gradle-plugins/blob/master/src/main/groovy/RunJRubyPlugin.groovy
      // http://tommy.chheng.com/2010/06/20/call-a-jruby-method-from-java/
      // http://musingsofaprogrammingaddict.blogspot.com/2009/02/using-jruby-with-maven.html
    }
}
