package io.yupiik.kubernetes.bindings.v1_13_7.v1beta1;

import java.util.Objects;

public class VolumeAttachmentSpec {
    private String attacher;
    private String nodeName;
    private VolumeAttachmentSpecSource source;

    public VolumeAttachmentSpec() {
        // no-op
    }

    public VolumeAttachmentSpec(final String attacher,
                                final String nodeName,
                                final VolumeAttachmentSpecSource source) {
        // no-op
    }

    public String getAttacher() {
        return attacher;
    }

    public void setAttacher(final String attacher) {
        this.attacher = attacher;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(final String nodeName) {
        this.nodeName = nodeName;
    }

    public VolumeAttachmentSpecSource getSource() {
        return source;
    }

    public void setSource(final VolumeAttachmentSpecSource source) {
        this.source = source;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                attacher,
                nodeName,
                source);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeAttachmentSpec)) {
            return false;
        }
        final VolumeAttachmentSpec __otherCasted = (VolumeAttachmentSpec) __other;
        return Objects.equals(attacher, __otherCasted.attacher) &&
            Objects.equals(nodeName, __otherCasted.nodeName) &&
            Objects.equals(source, __otherCasted.source);
    }
}
