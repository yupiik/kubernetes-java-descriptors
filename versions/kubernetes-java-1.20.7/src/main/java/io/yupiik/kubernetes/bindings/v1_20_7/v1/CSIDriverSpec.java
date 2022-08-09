package io.yupiik.kubernetes.bindings.v1_20_7.v1;

import io.yupiik.kubernetes.bindings.v1_20_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_7.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_20_7.Validable;
import io.yupiik.kubernetes.bindings.v1_20_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CSIDriverSpec implements Validable<CSIDriverSpec>, Exportable {
    private Boolean attachRequired;
    private String fsGroupPolicy;
    private Boolean podInfoOnMount;
    private Boolean requiresRepublish;
    private Boolean storageCapacity;
    private List<TokenRequest> tokenRequests;
    private List<String> volumeLifecycleModes;

    public CSIDriverSpec() {
        // no-op
    }

    public CSIDriverSpec(final Boolean attachRequired,
                         final String fsGroupPolicy,
                         final Boolean podInfoOnMount,
                         final Boolean requiresRepublish,
                         final Boolean storageCapacity,
                         final List<TokenRequest> tokenRequests,
                         final List<String> volumeLifecycleModes) {
        // no-op
    }

    public Boolean getAttachRequired() {
        return attachRequired;
    }

    public void setAttachRequired(final Boolean attachRequired) {
        this.attachRequired = attachRequired;
    }

    public String getFsGroupPolicy() {
        return fsGroupPolicy;
    }

    public void setFsGroupPolicy(final String fsGroupPolicy) {
        this.fsGroupPolicy = fsGroupPolicy;
    }

    public Boolean getPodInfoOnMount() {
        return podInfoOnMount;
    }

    public void setPodInfoOnMount(final Boolean podInfoOnMount) {
        this.podInfoOnMount = podInfoOnMount;
    }

    public Boolean getRequiresRepublish() {
        return requiresRepublish;
    }

    public void setRequiresRepublish(final Boolean requiresRepublish) {
        this.requiresRepublish = requiresRepublish;
    }

    public Boolean getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(final Boolean storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public List<TokenRequest> getTokenRequests() {
        return tokenRequests;
    }

    public void setTokenRequests(final List<TokenRequest> tokenRequests) {
        this.tokenRequests = tokenRequests;
    }

    public List<String> getVolumeLifecycleModes() {
        return volumeLifecycleModes;
    }

    public void setVolumeLifecycleModes(final List<String> volumeLifecycleModes) {
        this.volumeLifecycleModes = volumeLifecycleModes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                attachRequired,
                fsGroupPolicy,
                podInfoOnMount,
                requiresRepublish,
                storageCapacity,
                tokenRequests,
                volumeLifecycleModes);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CSIDriverSpec)) {
            return false;
        }
        final CSIDriverSpec __otherCasted = (CSIDriverSpec) __other;
        return Objects.equals(attachRequired, __otherCasted.attachRequired) &&
            Objects.equals(fsGroupPolicy, __otherCasted.fsGroupPolicy) &&
            Objects.equals(podInfoOnMount, __otherCasted.podInfoOnMount) &&
            Objects.equals(requiresRepublish, __otherCasted.requiresRepublish) &&
            Objects.equals(storageCapacity, __otherCasted.storageCapacity) &&
            Objects.equals(tokenRequests, __otherCasted.tokenRequests) &&
            Objects.equals(volumeLifecycleModes, __otherCasted.volumeLifecycleModes);
    }

    public CSIDriverSpec attachRequired(final Boolean attachRequired) {
        this.attachRequired = attachRequired;
        return this;
    }

    public CSIDriverSpec fsGroupPolicy(final String fsGroupPolicy) {
        this.fsGroupPolicy = fsGroupPolicy;
        return this;
    }

    public CSIDriverSpec podInfoOnMount(final Boolean podInfoOnMount) {
        this.podInfoOnMount = podInfoOnMount;
        return this;
    }

    public CSIDriverSpec requiresRepublish(final Boolean requiresRepublish) {
        this.requiresRepublish = requiresRepublish;
        return this;
    }

    public CSIDriverSpec storageCapacity(final Boolean storageCapacity) {
        this.storageCapacity = storageCapacity;
        return this;
    }

    public CSIDriverSpec tokenRequests(final List<TokenRequest> tokenRequests) {
        this.tokenRequests = tokenRequests;
        return this;
    }

    public CSIDriverSpec volumeLifecycleModes(final List<String> volumeLifecycleModes) {
        this.volumeLifecycleModes = volumeLifecycleModes;
        return this;
    }

    @Override
    public CSIDriverSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (attachRequired != null ? "\"attachRequired\":" + attachRequired : ""),
                    (fsGroupPolicy != null ? "\"fsGroupPolicy\":\"" +  JsonStrings.escapeJson(fsGroupPolicy) + "\"" : ""),
                    (podInfoOnMount != null ? "\"podInfoOnMount\":" + podInfoOnMount : ""),
                    (requiresRepublish != null ? "\"requiresRepublish\":" + requiresRepublish : ""),
                    (storageCapacity != null ? "\"storageCapacity\":" + storageCapacity : ""),
                    (tokenRequests != null ? "\"tokenRequests\":" + tokenRequests.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (volumeLifecycleModes != null ? "\"volumeLifecycleModes\":" + volumeLifecycleModes.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
