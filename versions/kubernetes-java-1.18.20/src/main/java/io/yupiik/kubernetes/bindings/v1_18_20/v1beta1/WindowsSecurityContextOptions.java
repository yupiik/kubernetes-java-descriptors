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
package io.yupiik.kubernetes.bindings.v1_18_20.v1beta1;

import io.yupiik.kubernetes.bindings.v1_18_20.Exportable;
import io.yupiik.kubernetes.bindings.v1_18_20.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_18_20.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class WindowsSecurityContextOptions implements Validable<WindowsSecurityContextOptions>, Exportable {
    private String gmsaCredentialSpec;
    private String gmsaCredentialSpecName;
    private String runAsUserName;

    public WindowsSecurityContextOptions() {
        // no-op
    }

    public WindowsSecurityContextOptions(final String gmsaCredentialSpec,
                                         final String gmsaCredentialSpecName,
                                         final String runAsUserName) {
        this.gmsaCredentialSpec = gmsaCredentialSpec;
        this.gmsaCredentialSpecName = gmsaCredentialSpecName;
        this.runAsUserName = runAsUserName;
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

    public String getRunAsUserName() {
        return runAsUserName;
    }

    public void setRunAsUserName(final String runAsUserName) {
        this.runAsUserName = runAsUserName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                gmsaCredentialSpec,
                gmsaCredentialSpecName,
                runAsUserName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof WindowsSecurityContextOptions)) {
            return false;
        }
        final WindowsSecurityContextOptions __otherCasted = (WindowsSecurityContextOptions) __other;
        return Objects.equals(gmsaCredentialSpec, __otherCasted.gmsaCredentialSpec) &&
            Objects.equals(gmsaCredentialSpecName, __otherCasted.gmsaCredentialSpecName) &&
            Objects.equals(runAsUserName, __otherCasted.runAsUserName);
    }

    public WindowsSecurityContextOptions gmsaCredentialSpec(final String gmsaCredentialSpec) {
        this.gmsaCredentialSpec = gmsaCredentialSpec;
        return this;
    }

    public WindowsSecurityContextOptions gmsaCredentialSpecName(final String gmsaCredentialSpecName) {
        this.gmsaCredentialSpecName = gmsaCredentialSpecName;
        return this;
    }

    public WindowsSecurityContextOptions runAsUserName(final String runAsUserName) {
        this.runAsUserName = runAsUserName;
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
                    (gmsaCredentialSpecName != null ? "\"gmsaCredentialSpecName\":\"" +  JsonStrings.escapeJson(gmsaCredentialSpecName) + "\"" : ""),
                    (runAsUserName != null ? "\"runAsUserName\":\"" +  JsonStrings.escapeJson(runAsUserName) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
