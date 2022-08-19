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
package io.yupiik.kubernetes.bindings.v1_20_10.v1;

import io.yupiik.kubernetes.bindings.v1_20_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_10.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_20_10.Validable;
import io.yupiik.kubernetes.bindings.v1_20_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ContainerStatus implements Validable<ContainerStatus>, Exportable {
    private String containerID;
    private String image;
    private String imageID;
    private ContainerState lastState;
    private String name;
    private boolean ready;
    private int restartCount;
    private Boolean started;
    private ContainerState state;

    public ContainerStatus() {
        // no-op
    }

    public ContainerStatus(final String containerID,
                           final String image,
                           final String imageID,
                           final ContainerState lastState,
                           final String name,
                           final boolean ready,
                           final int restartCount,
                           final Boolean started,
                           final ContainerState state) {
        this.containerID = containerID;
        this.image = image;
        this.imageID = imageID;
        this.lastState = lastState;
        this.name = name;
        this.ready = ready;
        this.restartCount = restartCount;
        this.started = started;
        this.state = state;
    }

    public String getContainerID() {
        return containerID;
    }

    public void setContainerID(final String containerID) {
        this.containerID = containerID;
    }

    public String getImage() {
        return image;
    }

    public void setImage(final String image) {
        this.image = image;
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(final String imageID) {
        this.imageID = imageID;
    }

    public ContainerState getLastState() {
        return lastState;
    }

    public void setLastState(final ContainerState lastState) {
        this.lastState = lastState;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public boolean getReady() {
        return ready;
    }

    public void setReady(final boolean ready) {
        this.ready = ready;
    }

    public int getRestartCount() {
        return restartCount;
    }

    public void setRestartCount(final int restartCount) {
        this.restartCount = restartCount;
    }

    public Boolean getStarted() {
        return started;
    }

    public void setStarted(final Boolean started) {
        this.started = started;
    }

    public ContainerState getState() {
        return state;
    }

    public void setState(final ContainerState state) {
        this.state = state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                containerID,
                image,
                imageID,
                lastState,
                name,
                ready,
                restartCount,
                started,
                state);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ContainerStatus)) {
            return false;
        }
        final ContainerStatus __otherCasted = (ContainerStatus) __other;
        return Objects.equals(containerID, __otherCasted.containerID) &&
            Objects.equals(image, __otherCasted.image) &&
            Objects.equals(imageID, __otherCasted.imageID) &&
            Objects.equals(lastState, __otherCasted.lastState) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(ready, __otherCasted.ready) &&
            Objects.equals(restartCount, __otherCasted.restartCount) &&
            Objects.equals(started, __otherCasted.started) &&
            Objects.equals(state, __otherCasted.state);
    }

    public ContainerStatus containerID(final String containerID) {
        this.containerID = containerID;
        return this;
    }

    public ContainerStatus image(final String image) {
        this.image = image;
        return this;
    }

    public ContainerStatus imageID(final String imageID) {
        this.imageID = imageID;
        return this;
    }

    public ContainerStatus lastState(final ContainerState lastState) {
        this.lastState = lastState;
        return this;
    }

    public ContainerStatus name(final String name) {
        this.name = name;
        return this;
    }

    public ContainerStatus ready(final boolean ready) {
        this.ready = ready;
        return this;
    }

    public ContainerStatus restartCount(final int restartCount) {
        this.restartCount = restartCount;
        return this;
    }

    public ContainerStatus started(final Boolean started) {
        this.started = started;
        return this;
    }

    public ContainerStatus state(final ContainerState state) {
        this.state = state;
        return this;
    }

    @Override
    public ContainerStatus validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (image == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "image", "image",
                "Missing 'image' attribute.", true));
        }
        if (imageID == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "imageID", "imageID",
                "Missing 'imageID' attribute.", true));
        }
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (containerID != null ? "\"containerID\":\"" +  JsonStrings.escapeJson(containerID) + "\"" : ""),
                    (image != null ? "\"image\":\"" +  JsonStrings.escapeJson(image) + "\"" : ""),
                    (imageID != null ? "\"imageID\":\"" +  JsonStrings.escapeJson(imageID) + "\"" : ""),
                    (lastState != null ? "\"lastState\":" + lastState.asJson() : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    "\"ready\":" + ready,
                    "\"restartCount\":" + restartCount,
                    (started != null ? "\"started\":" + started : ""),
                    (state != null ? "\"state\":" + state.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
