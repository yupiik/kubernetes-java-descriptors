package io.yupiik.kubernetes.bindings.v1_16_0.v1alpha1;

import java.util.Objects;

public class VolumeAttachmentListItemsSpec {
    private String attacher;
    private String nodeName;
    private VolumeAttachmentListItemsSpecSource source;

    public VolumeAttachmentListItemsSpec() {
        // no-op
    }

    public VolumeAttachmentListItemsSpec(final String attacher,
                                         final String nodeName,
                                         final VolumeAttachmentListItemsSpecSource source) {
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

    public VolumeAttachmentListItemsSpecSource getSource() {
        return source;
    }

    public void setSource(final VolumeAttachmentListItemsSpecSource source) {
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
        if (!(__other instanceof VolumeAttachmentListItemsSpec)) {
            return false;
        }
        final VolumeAttachmentListItemsSpec __otherCasted = (VolumeAttachmentListItemsSpec) __other;
        return Objects.equals(attacher, __otherCasted.attacher) &&
            Objects.equals(nodeName, __otherCasted.nodeName) &&
            Objects.equals(source, __otherCasted.source);
    }
}
