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
package io.yupiik.kubernetes.bindings.v1_29_13.v1;

import io.yupiik.kubernetes.bindings.v1_29_13.Exportable;
import io.yupiik.kubernetes.bindings.v1_29_13.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class SelfSubjectReviewStatus implements Validable<SelfSubjectReviewStatus>, Exportable {
    private UserInfo userInfo;

    public SelfSubjectReviewStatus() {
        // no-op
    }

    public SelfSubjectReviewStatus(final UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(final UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                userInfo);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SelfSubjectReviewStatus)) {
            return false;
        }
        final SelfSubjectReviewStatus __otherCasted = (SelfSubjectReviewStatus) __other;
        return Objects.equals(userInfo, __otherCasted.userInfo);
    }

    public SelfSubjectReviewStatus userInfo(final UserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    @Override
    public SelfSubjectReviewStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (userInfo != null ? "\"userInfo\":" + userInfo.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
