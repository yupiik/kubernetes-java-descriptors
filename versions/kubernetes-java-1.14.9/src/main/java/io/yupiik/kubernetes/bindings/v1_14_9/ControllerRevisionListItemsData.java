package io.yupiik.kubernetes.bindings.v1_14_9;

import java.util.Objects;

public class ControllerRevisionListItemsData {
    private String Raw;

    public ControllerRevisionListItemsData() {
        // no-op
    }

    public ControllerRevisionListItemsData(final String Raw) {
        // no-op
    }

    public String getRaw() {
        return Raw;
    }

    public void setRaw(final String Raw) {
        this.Raw = Raw;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                Raw);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ControllerRevisionListItemsData)) {
            return false;
        }
        final ControllerRevisionListItemsData __otherCasted = (ControllerRevisionListItemsData) __other;
        return Objects.equals(Raw, __otherCasted.Raw);
    }
}
