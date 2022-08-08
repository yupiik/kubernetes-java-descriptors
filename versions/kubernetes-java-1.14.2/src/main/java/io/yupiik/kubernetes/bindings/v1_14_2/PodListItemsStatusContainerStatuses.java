package io.yupiik.kubernetes.bindings.v1_14_2;

import java.util.Objects;

public class PodListItemsStatusContainerStatuses {
    private String containerID;
    private String image;
    private String imageID;
    private PodListItemsStatusContainerStatusesLastState lastState;
    private String name;
    private boolean ready;
    private int restartCount;
    private PodListItemsStatusContainerStatusesState state;

    public PodListItemsStatusContainerStatuses() {
        // no-op
    }

    public PodListItemsStatusContainerStatuses(final String containerID,
                                               final String image,
                                               final String imageID,
                                               final PodListItemsStatusContainerStatusesLastState lastState,
                                               final String name,
                                               final boolean ready,
                                               final int restartCount,
                                               final PodListItemsStatusContainerStatusesState state) {
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

    public PodListItemsStatusContainerStatusesLastState getLastState() {
        return lastState;
    }

    public void setLastState(final PodListItemsStatusContainerStatusesLastState lastState) {
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

    public PodListItemsStatusContainerStatusesState getState() {
        return state;
    }

    public void setState(final PodListItemsStatusContainerStatusesState state) {
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
                state);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodListItemsStatusContainerStatuses)) {
            return false;
        }
        final PodListItemsStatusContainerStatuses __otherCasted = (PodListItemsStatusContainerStatuses) __other;
        return Objects.equals(containerID, __otherCasted.containerID) &&
            Objects.equals(image, __otherCasted.image) &&
            Objects.equals(imageID, __otherCasted.imageID) &&
            Objects.equals(lastState, __otherCasted.lastState) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(ready, __otherCasted.ready) &&
            Objects.equals(restartCount, __otherCasted.restartCount) &&
            Objects.equals(state, __otherCasted.state);
    }
}
