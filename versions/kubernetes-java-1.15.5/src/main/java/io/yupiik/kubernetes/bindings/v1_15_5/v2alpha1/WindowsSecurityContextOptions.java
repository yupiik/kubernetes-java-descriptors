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
package io.yupiik.kubernetes.bindings.v1_15_5.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_15_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_15_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_15_5.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class WindowsSecurityContextOptions implements Validable<WindowsSecurityContextOptions>, Exportable {
    private String gmsaCredentialSpec;
    private String gmsaCredentialSpecName;

    public WindowsSecurityContextOptions() {
        // no-op
    }

    public WindowsSecurityContextOptions(final String gmsaCredentialSpec,
                                         final String gmsaCredentialSpecName) {
        this.gmsaCredentialSpec = gmsaCredentialSpec;
        this.gmsaCredentialSpecName = gmsaCredentialSpecName;
    }

    public String getGmsaCredentialSpec() {
        return gmsaCredentialSpec;
    }

    public void setGmsaCredentialSpec(final String gmsaCredentialSpec) {
        this.gmsaCredentialSpec = gmsaCredentialSpec;
    }

    public String getGmsaCredentialSpecName() {
        return gmsaCredentialSpecName;
    }

    public void setGmsaCredentialSpecName(final String gmsaCredentialSpecName) {
        this.gmsaCredentialSpecName = gmsaCredentialSpecName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                gmsaCredentialSpec,
                gmsaCredentialSpecName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof WindowsSecurityContextOptions)) {
            return false;
        }
        final WindowsSecurityContextOptions __otherCasted = (WindowsSecurityContextOptions) __other;
        return Objects.equals(gmsaCredentialSpec, __otherCasted.gmsaCredentialSpec) &&
            Objects.equals(gmsaCredentialSpecName, __otherCasted.gmsaCredentialSpecName);
    }

    public WindowsSecurityContextOptions gmsaCredentialSpec(final String gmsaCredentialSpec) {
        this.gmsaCredentialSpec = gmsaCredentialSpec;
        return this;
    }

    public WindowsSecurityContextOptions gmsaCredentialSpecName(final String gmsaCredentialSpecName) {
        this.gmsaCredentialSpecName = gmsaCredentialSpecName;
        return this;
    }

    @Override
    public WindowsSecurityContextOptions validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (gmsaCredentialSpec != null ? "\"gmsaCredentialSpec\":\"" +  JsonStrings.escapeJson(gmsaCredentialSpec) + "\"" : ""),
                    (gmsaCredentialSpecName != null ? "\"gmsaCredentialSpecName\":\"" +  JsonStrings.escapeJson(gmsaCredentialSpecName) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
