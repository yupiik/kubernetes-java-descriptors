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
package io.yupiik.kubernetes.bindings.v1_24_2.v1beta1;

import io.yupiik.kubernetes.bindings.v1_24_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_24_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_24_2.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class FlockerVolumeSource implements Validable<FlockerVolumeSource>, Exportable {
    private String datasetName;
    private String datasetUUID;

    public FlockerVolumeSource() {
        // no-op
    }

    public FlockerVolumeSource(final String datasetName,
                               final String datasetUUID) {
        this.datasetName = datasetName;
        this.datasetUUID = datasetUUID;
    }

    public String getDatasetName() {
        return datasetName;
    }

    public void setDatasetName(final String datasetName) {
        this.datasetName = datasetName;
    }

    public String getDatasetUUID() {
        return datasetUUID;
    }

    public void setDatasetUUID(final String datasetUUID) {
        this.datasetUUID = datasetUUID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                datasetName,
                datasetUUID);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof FlockerVolumeSource)) {
            return false;
        }
        final FlockerVolumeSource __otherCasted = (FlockerVolumeSource) __other;
        return Objects.equals(datasetName, __otherCasted.datasetName) &&
            Objects.equals(datasetUUID, __otherCasted.datasetUUID);
    }

    public FlockerVolumeSource datasetName(final String datasetName) {
        this.datasetName = datasetName;
        return this;
    }

    public FlockerVolumeSource datasetUUID(final String datasetUUID) {
        this.datasetUUID = datasetUUID;
        return this;
    }

    @Override
    public FlockerVolumeSource validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (datasetName != null ? "\"datasetName\":\"" +  JsonStrings.escapeJson(datasetName) + "\"" : ""),
                    (datasetUUID != null ? "\"datasetUUID\":\"" +  JsonStrings.escapeJson(datasetUUID) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
