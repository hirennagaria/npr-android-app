// Copyright 2009 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.npr.api;


public class Topic extends StoryGrouping {
  public static StoryGroupingFactory<Topic> factory =
    StoryGroupingFactory.getFactory(Topic.class, "3002");

  public Topic(String id, String title, int storycounttoday,
      int storycountmonth, int storycountall, String additionalInfo) {
    super(id, title, storycounttoday, storycountmonth, storycountall,
        additionalInfo);
  }
}