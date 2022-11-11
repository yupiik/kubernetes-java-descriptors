/*
 * Copyright (c) 2022 - Yupiik SAS - https://www.yupiik.com
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
package io.yupiik.kubernetes.bindings.v1_19_11.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_19_11.Exportable;
import io.yupiik.kubernetes.bindings.v1_19_11.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_19_11.Validable;
import io.yupiik.kubernetes.bindings.v1_19_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Subject implements Validable<Subject>, Exportable {
    private GroupSubject group;
    private String kind;
    private ServiceAccountSubject serviceAccount;
    private UserSubject user;

    public Subject() {
        // no-op
    }

    public Subject(final GroupSubject group,
                   final String kind,
                   final ServiceAccountSubject serviceAccount,
                   final UserSubject user) {
        this.group = group;
        this.kind = kind;
        this.serviceAccount = serviceAccount;
        this.user = user;
    }

    public GroupSubject getGroup() {
        return group;
    }

    public void setGroup(final GroupSubject group) {
        this.group = group;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ServiceAccountSubject getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(final ServiceAccountSubject serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    public UserSubject getUser() {
        return user;
    }

    public void setUser(final UserSubject user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                group,
                kind,
                serviceAccount,
                user);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Subject)) {
            return false;
        }
        final Subject __otherCasted = (Subject) __other;
        return Objects.equals(group, __otherCasted.group) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(serviceAccount, __otherCasted.serviceAccount) &&
            Objects.equals(user, __otherCasted.user);
    }

    public Subject group(final GroupSubject group) {
        this.group = group;
        return this;
    }

    public Subject kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public Subject serviceAccount(final ServiceAccountSubject serviceAccount) {
        this.serviceAccount = serviceAccount;
        return this;
    }

    public Subject user(final UserSubject user) {
        this.user = user;
        return this;
    }

    @Override
    public Subject validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (kind == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "kind", "kind",
                "Missing 'kind' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (group != null ? "\"group\":" + group.asJson() : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (serviceAccount != null ? "\"serviceAccount\":" + serviceAccount.asJson() : ""),
                    (user != null ? "\"user\":" + user.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
