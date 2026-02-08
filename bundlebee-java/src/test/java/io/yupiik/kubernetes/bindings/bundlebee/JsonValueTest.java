/*
 * Copyright (c) 2022 - present - Yupiik SAS - https://www.yupiik.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.yupiik.kubernetes.bindings.bundlebee;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JsonValueTest {
    @Test
    void booleanValues() {
        assertEquals("true", new JsonValue(true).toString());
        assertEquals("false", new JsonValue(false).toString());
    }

    @Test
    void numbers() {
        assertEquals("1", new JsonValue(1).toString());
        assertEquals("1.2", new JsonValue(1.2).toString());
        assertEquals("10", new JsonValue(BigDecimal.TEN).toString());
    }

    @Test
    void strings() {
        assertEquals("\"\"", new JsonValue("").toString());
        assertEquals("\"foo\\ntest\"", new JsonValue("foo\ntest").toString());
    }

    @Test
    void array() {
        assertEquals(
                "[true,1.2,\"test\",{\"k1\":21,\"n1\":\"-1\"},[\"a\",{\"k\":2,\"n\":\"-\"}]]",
                new JsonValue(new JsonArray(List.of(
                        new JsonValue(true),
                        new JsonValue(1.2),
                        new JsonValue("test"),
                        new JsonObject(new TreeMap<>(String.CASE_INSENSITIVE_ORDER) {{
                            putAll(Map.of("n1", new JsonValue("-1"), "k1", new JsonValue(21)));
                        }}),
                        new JsonArray(List.of(
                                new JsonValue("a"),
                                new JsonObject(new TreeMap<>(String.CASE_INSENSITIVE_ORDER) {{
                                    putAll(Map.of(
                                            "n", new JsonValue("-"),
                                            "k", new JsonValue(2)));
                                }}))))))
                        .toString());
    }

    @Test
    void objects() {
        assertEquals(
                "{\"a\":[1,\"a\"],\"i\":21,\"o\":{\"k\":\"v\"},\"s\":\"ok\"}",
                new JsonObject(new TreeMap<>(String.CASE_INSENSITIVE_ORDER) {{
                    putAll(Map.of(
                            "s", new JsonValue("ok"),
                            "i", new JsonValue(21),
                            "a", new JsonArray(List.of(1, "a")),
                            "o", new JsonObject(Map.of("k", "v"))));
                }}).toString());
    }
}
