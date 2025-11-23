package io.yupiik.kubernetes.bindings.v1_31_3.v1;

import io.yupiik.kubernetes.bindings.v1_31_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_3.Validable;
import io.yupiik.kubernetes.bindings.v1_31_3.ValidationException;
import jakarta.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ContainerStatus implements Validable<ContainerStatus>, Exportable {
    private JsonObject allocatedResources;
    private List<ResourceStatus> allocatedResourcesStatus;
    private String containerID;
    private String image;
    private String imageID;
    private ContainerState lastState;
    private String name;
    private boolean ready;
    private ResourceRequirements resources;
    private int restartCount;
    private Boolean started;
    private ContainerState state;
    private ContainerUser user;
    private List<VolumeMountStatus> volumeMounts;

    public ContainerStatus() {
        // no-op
    }

    public ContainerStatus(final JsonObject allocatedResources,
                           final List<ResourceStatus> allocatedResourcesStatus,
                           final String containerID,
                           final String image,
                           final String imageID,
                           final ContainerState lastState,
                           final String name,
                           final boolean ready,
                           final ResourceRequirements resources,
                           final int restartCount,
                           final Boolean started,
                           final ContainerState state,
                           final ContainerUser user,
                           final List<VolumeMountStatus> volumeMounts) {
        this.allocatedResources = allocatedResources;
        this.allocatedResourcesStatus = allocatedResourcesStatus;
        this.containerID = containerID;
        this.image = image;
        this.imageID = imageID;
        this.lastState = lastState;
        this.name = name;
        this.ready = ready;
        this.resources = resources;
        this.restartCount = restartCount;
        this.started = started;
        this.state = state;
        this.user = user;
        this.volumeMounts = volumeMounts;
    }

    public JsonObject getAllocatedResources() {
        return allocatedResources;
    }

    public void setAllocatedResources(final JsonObject allocatedResources) {
        this.allocatedResources = allocatedResources;
    }

    public List<ResourceStatus> getAllocatedResourcesStatus() {
        return allocatedResourcesStatus;
    }

    public void setAllocatedResourcesStatus(final List<ResourceStatus> allocatedResourcesStatus) {
        this.allocatedResourcesStatus = allocatedResourcesStatus;
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

    public ResourceRequirements getResources() {
        return resources;
    }

    public void setResources(final ResourceRequirements resources) {
        this.resources = resources;
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

    public ContainerUser getUser() {
        return user;
    }

    public void setUser(final ContainerUser user) {
        this.user = user;
    }

    public List<VolumeMountStatus> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<VolumeMountStatus> volumeMounts) {
        this.volumeMounts = volumeMounts;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                allocatedResources,
                allocatedResourcesStatus,
                containerID,
                image,
                imageID,
                lastState,
                name,
                ready,
                resources,
                restartCount,
                started,
                state,
                user,
                volumeMounts);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ContainerStatus)) {
            return false;
        }
        final ContainerStatus __otherCasted = (ContainerStatus) __other;
        return Objects.equals(allocatedResources, __otherCasted.allocatedResources) &&
            Objects.equals(allocatedResourcesStatus, __otherCasted.allocatedResourcesStatus) &&
            Objects.equals(containerID, __otherCasted.containerID) &&
            Objects.equals(image, __otherCasted.image) &&
            Objects.equals(imageID, __otherCasted.imageID) &&
            Objects.equals(lastState, __otherCasted.lastState) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(ready, __otherCasted.ready) &&
            Objects.equals(resources, __otherCasted.resources) &&
            Objects.equals(restartCount, __otherCasted.restartCount) &&
            Objects.equals(started, __otherCasted.started) &&
            Objects.equals(state, __otherCasted.state) &&
            Objects.equals(user, __otherCasted.user) &&
            Objects.equals(volumeMounts, __otherCasted.volumeMounts);
    }

    public ContainerStatus allocatedResources(final JsonObject allocatedResources) {
        this.allocatedResources = allocatedResources;
        return this;
    }

    public ContainerStatus allocatedResourcesStatus(final List<ResourceStatus> allocatedResourcesStatus) {
        this.allocatedResourcesStatus = allocatedResourcesStatus;
        return this;
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

    public ContainerStatus resources(final ResourceRequirements resources) {
        this.resources = resources;
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

    public ContainerStatus user(final ContainerUser user) {
        this.user = user;
        return this;
    }

    public ContainerStatus volumeMounts(final List<VolumeMountStatus> volumeMounts) {
        this.volumeMounts = volumeMounts;
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
                    (allocatedResources != null ? "\"allocatedResources\":" + allocatedResources : ""),
                    (allocatedResourcesStatus != null ? "\"allocatedResourcesStatus\":" + allocatedResourcesStatus.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (containerID != null ? "\"containerID\":\"" +  JsonStrings.escapeJson(containerID) + "\"" : ""),
                    (image != null ? "\"image\":\"" +  JsonStrings.escapeJson(image) + "\"" : ""),
                    (imageID != null ? "\"imageID\":\"" +  JsonStrings.escapeJson(imageID) + "\"" : ""),
                    (lastState != null ? "\"lastState\":" + lastState.asJson() : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    "\"ready\":" + ready,
                    (resources != null ? "\"resources\":" + resources.asJson() : ""),
                    "\"restartCount\":" + restartCount,
                    (started != null ? "\"started\":" + started : ""),
                    (state != null ? "\"state\":" + state.asJson() : ""),
                    (user != null ? "\"user\":" + user.asJson() : ""),
                    (volumeMounts != null ? "\"volumeMounts\":" + volumeMounts.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
