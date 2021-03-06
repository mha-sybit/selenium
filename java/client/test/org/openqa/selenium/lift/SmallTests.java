/*
Copyright 2012 Software Freedom Conservancy
Copyright 2011-2012 Selenium committers

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package org.openqa.selenium.lift;

import org.openqa.selenium.lift.find.XPathFinderTest;
import org.openqa.selenium.lift.match.DisplayedMatcherTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  DisplayedMatcherTest.class,
  HamcrestWebdriverTestCaseTest.class,
  TestContextTest.class,
  WebDriverTestContextTest.class,
  XPathFinderTest.class
})
public class SmallTests {}
