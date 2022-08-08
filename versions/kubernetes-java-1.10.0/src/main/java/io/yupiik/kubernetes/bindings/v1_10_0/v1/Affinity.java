package io.yupiik.kubernetes.bindings.v1_10_0.v1;

import io.yupiik.kubernetes.bindings.v1_10_0.Validable;
import io.yupiik.kubernetes.bindings.v1_10_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Affinity implements Validable<Affinity> {
    private NodeAffinity nodeAffinity;
    private PodAffinity podAffinity;
    private PodAntiAffinity podAntiAffinity;

    public Affinity() {
        // no-op
    }

    public Affinity(final NodeAffinity nodeAffinity,
                    final PodAffinity podAffinity,
                    final PodAntiAffinity podAntiAffinity) {
        // no-op
    }

    public NodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(final NodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public PodAffinity getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(final PodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    public PodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(final PodAntiAffinity podAntiAffinity) {
        this.podAntiAffinity = podAntiAffinity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                nodeAffinity,
                podAffinity,
                podAntiAffinity);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Affinity)) {
            return false;
        }
        final Affinity __otherCasted = (Affinity) __other;
        return Objects.equals(nodeAffinity, __otherCasted.nodeAffinity) &&
            Objects.equals(podAffinity, __otherCasted.podAffinity) &&
            Objects.equals(podAntiAffinity, __otherCasted.podAntiAffinity);
    }

    public Affinity nodeAffinity(final NodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
        return this;
    }

    public Affinity podAffinity(final PodAffinity podAffinity) {
        this.podAffinity = podAffinity;
        return this;
    }

    public Affinity podAntiAffinity(final PodAntiAffinity podAntiAffinity) {
        this.podAntiAffinity = podAntiAffinity;
        return this;
    }

    @Override
    public Affinity validate() {
        return this;
    }
}
