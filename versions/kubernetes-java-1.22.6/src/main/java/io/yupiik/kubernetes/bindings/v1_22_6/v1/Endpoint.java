package io.yupiik.kubernetes.bindings.v1_22_6.v1;

import io.yupiik.kubernetes.bindings.v1_22_6.Validable;
import io.yupiik.kubernetes.bindings.v1_22_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Endpoint implements Validable<Endpoint> {
    private List<String> addresses;
    private EndpointConditions conditions;
    private Map<String, String> deprecatedTopology;
    private EndpointHints hints;
    private String hostname;
    private String nodeName;
    private ObjectReference targetRef;
    private String zone;

    public Endpoint() {
        // no-op
    }

    public Endpoint(final List<String> addresses,
                    final EndpointConditions conditions,
                    final Map<String, String> deprecatedTopology,
                    final EndpointHints hints,
                    final String hostname,
                    final String nodeName,
                    final ObjectReference targetRef,
                    final String zone) {
        // no-op
    }

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(final List<String> addresses) {
        this.addresses = addresses;
    }

    public EndpointConditions getConditions() {
        return conditions;
    }

    public void setConditions(final EndpointConditions conditions) {
        this.conditions = conditions;
    }

    public Map<String, String> getDeprecatedTopology() {
        return deprecatedTopology;
    }

    public void setDeprecatedTopology(final Map<String, String> deprecatedTopology) {
        this.deprecatedTopology = deprecatedTopology;
    }

    public EndpointHints getHints() {
        return hints;
    }

    public void setHints(final EndpointHints hints) {
        this.hints = hints;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(final String hostname) {
        this.hostname = hostname;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(final String nodeName) {
        this.nodeName = nodeName;
    }

    public ObjectReference getTargetRef() {
        return targetRef;
    }

    public void setTargetRef(final ObjectReference targetRef) {
        this.targetRef = targetRef;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(final String zone) {
        this.zone = zone;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                addresses,
                conditions,
                deprecatedTopology,
                hints,
                hostname,
                nodeName,
                targetRef,
                zone);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Endpoint)) {
            return false;
        }
        final Endpoint __otherCasted = (Endpoint) __other;
        return Objects.equals(addresses, __otherCasted.addresses) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(deprecatedTopology, __otherCasted.deprecatedTopology) &&
            Objects.equals(hints, __otherCasted.hints) &&
            Objects.equals(hostname, __otherCasted.hostname) &&
            Objects.equals(nodeName, __otherCasted.nodeName) &&
            Objects.equals(targetRef, __otherCasted.targetRef) &&
            Objects.equals(zone, __otherCasted.zone);
    }

    public Endpoint addresses(final List<String> addresses) {
        this.addresses = addresses;
        return this;
    }

    public Endpoint conditions(final EndpointConditions conditions) {
        this.conditions = conditions;
        return this;
    }

    public Endpoint deprecatedTopology(final Map<String, String> deprecatedTopology) {
        this.deprecatedTopology = deprecatedTopology;
        return this;
    }

    public Endpoint hints(final EndpointHints hints) {
        this.hints = hints;
        return this;
    }

    public Endpoint hostname(final String hostname) {
        this.hostname = hostname;
        return this;
    }

    public Endpoint nodeName(final String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    public Endpoint targetRef(final ObjectReference targetRef) {
        this.targetRef = targetRef;
        return this;
    }

    public Endpoint zone(final String zone) {
        this.zone = zone;
        return this;
    }

    @Override
    public Endpoint validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (addresses == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "addresses", "addresses",
                "Missing 'addresses' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
