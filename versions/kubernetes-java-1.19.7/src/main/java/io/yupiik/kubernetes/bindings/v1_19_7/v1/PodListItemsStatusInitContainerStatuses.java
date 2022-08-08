package io.yupiik.kubernetes.bindings.v1_19_7.v1;

import java.util.Objects;

public class PodListItemsStatusInitContainerStatuses {
    private String containerID;
    private String image;
    private String imageID;
    private PodListItemsStatusInitContainerStatusesLastState lastState;
    private String name;
    private boolean ready;
    private int restartCount;
    private Boolean started;
    private PodListItemsStatusInitContainerStatusesState state;

    public PodListItemsStatusInitContainerStatuses() {
        // no-op
    }

    public PodListItemsStatusInitContainerStatuses(final String containerID,
                                                   final String image,
                                                   final String imageID,
                                                   final PodListItemsStatusInitContainerStatusesLastState lastState,
                                                   final String name,
                                                   final boolean ready,
                                                   final int restartCount,
                                                   final Boolean started,
                                                   final PodListItemsStatusInitContainerStatusesState state) {
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

    public PodListItemsStatusInitContainerStatusesLastState getLastState() {
        return lastState;
    }

    public void setLastState(final PodListItemsStatusInitContainerStatusesLastState lastState) {
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

    public PodListItemsStatusInitContainerStatusesState getState() {
        return state;
    }

    public void setState(final PodListItemsStatusInitContainerStatusesState state) {
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
        if (!(__other instanceof PodListItemsStatusInitContainerStatuses)) {
            return false;
        }
        final PodListItemsStatusInitContainerStatuses __otherCasted = (PodListItemsStatusInitContainerStatuses) __other;
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
}
