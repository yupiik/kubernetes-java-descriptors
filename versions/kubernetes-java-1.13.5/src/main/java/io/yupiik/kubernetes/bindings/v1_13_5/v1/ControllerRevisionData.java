package io.yupiik.kubernetes.bindings.v1_13_5.v1;

import java.util.Objects;

public class ControllerRevisionData {
    private String Raw;

    public ControllerRevisionData() {
        // no-op
    }

    public ControllerRevisionData(final String Raw) {
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
        if (!(__other instanceof ControllerRevisionData)) {
            return false;
        }
        final ControllerRevisionData __otherCasted = (ControllerRevisionData) __other;
        return Objects.equals(Raw, __otherCasted.Raw);
    }
}
