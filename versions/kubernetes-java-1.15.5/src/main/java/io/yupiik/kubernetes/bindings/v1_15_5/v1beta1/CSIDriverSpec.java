package io.yupiik.kubernetes.bindings.v1_15_5.v1beta1;

import io.yupiik.kubernetes.bindings.v1_15_5.Validable;
import io.yupiik.kubernetes.bindings.v1_15_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CSIDriverSpec implements Validable<CSIDriverSpec> {
    private Boolean attachRequired;
    private Boolean podInfoOnMount;

    public CSIDriverSpec() {
        // no-op
    }

    public CSIDriverSpec(final Boolean attachRequired,
                         final Boolean podInfoOnMount) {
        // no-op
    }

    public Boolean getAttachRequired() {
        return attachRequired;
    }

    public void setAttachRequired(final Boolean attachRequired) {
        this.attachRequired = attachRequired;
    }

    public Boolean getPodInfoOnMount() {
        return podInfoOnMount;
    }

    public void setPodInfoOnMount(final Boolean podInfoOnMount) {
        this.podInfoOnMount = podInfoOnMount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                attachRequired,
                podInfoOnMount);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CSIDriverSpec)) {
            return false;
        }
        final CSIDriverSpec __otherCasted = (CSIDriverSpec) __other;
        return Objects.equals(attachRequired, __otherCasted.attachRequired) &&
            Objects.equals(podInfoOnMount, __otherCasted.podInfoOnMount);
    }

    public CSIDriverSpec attachRequired(final Boolean attachRequired) {
        this.attachRequired = attachRequired;
        return this;
    }

    public CSIDriverSpec podInfoOnMount(final Boolean podInfoOnMount) {
        this.podInfoOnMount = podInfoOnMount;
        return this;
    }

    @Override
    public CSIDriverSpec validate() {
        return this;
    }
}
