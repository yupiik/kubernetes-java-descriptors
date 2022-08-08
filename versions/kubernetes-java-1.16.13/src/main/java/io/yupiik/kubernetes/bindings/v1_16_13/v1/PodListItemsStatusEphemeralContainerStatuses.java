package io.yupiik.kubernetes.bindings.v1_16_13.v1;

import java.util.Objects;

public class PodListItemsStatusEphemeralContainerStatuses {
    private String containerID;
    private String image;
    private String imageID;
    private PodListItemsStatusEphemeralContainerStatusesLastState lastState;
    private String name;
    private boolean ready;
    private int restartCount;
    private Boolean started;
    private PodListItemsStatusEphemeralContainerStatusesState state;

    public PodListItemsStatusEphemeralContainerStatuses() {
        // no-op
    }

    public PodListItemsStatusEphemeralContainerStatuses(final String containerID,
                                                        final String image,
                                                        final String imageID,
                                                        final PodListItemsStatusEphemeralContainerStatusesLastState lastState,
                                                        final String name,
                                                        final boolean ready,
                                                        final int restartCount,
                                                        final Boolean started,
                                                        final PodListItemsStatusEphemeralContainerStatusesState state) {
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

    public PodListItemsStatusEphemeralContainerStatusesLastState getLastState() {
        return lastState;
    }

    public void setLastState(final PodListItemsStatusEphemeralContainerStatusesLastState lastState) {
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

    public PodListItemsStatusEphemeralContainerStatusesState getState() {
        return state;
    }

    public void setState(final PodListItemsStatusEphemeralContainerStatusesState state) {
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
        if (!(__other instanceof PodListItemsStatusEphemeralContainerStatuses)) {
            return false;
        }
        final PodListItemsStatusEphemeralContainerStatuses __otherCasted = (PodListItemsStatusEphemeralContainerStatuses) __other;
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
