/*
 * Copyright (c) 2016 Nick Guo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.nick.eventbussample;

import android.app.Application;

import com.nick.scalpel.Scalpel;
import com.nick.scalpel.config.Configuration;

import dev.nick.eventbus.EventBus;

/**
 * Created by nick on 16-4-1.
 * Email: nick.guo.dev@icloud.com
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Scalpel.create(this).config(Configuration.builder()
                .debug(true)
                .logTag("EventBus")
                .build());
        EventBus.create(this).setDebuggable(true);
    }
}
