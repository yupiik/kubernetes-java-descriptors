package io.yupiik.kubernetes.bindings.v1_24_2.v1;

import io.yupiik.kubernetes.bindings.v1_24_2.Validable;
import io.yupiik.kubernetes.bindings.v1_24_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ContainerStatus implements Validable<ContainerStatus> {
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
        // no-op
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
}
