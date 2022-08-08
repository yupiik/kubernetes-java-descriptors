package io.yupiik.kubernetes.bindings.v1_18_6.v1beta1;

import io.yupiik.kubernetes.bindings.v1_18_6.Validable;
import io.yupiik.kubernetes.bindings.v1_18_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Endpoint implements Validable<Endpoint> {
    private List<String> addresses;
    private EndpointConditions conditions;
    private String hostname;
    private ObjectReference targetRef;
    private Map<String, String> topology;

    public Endpoint() {
        // no-op
    }

    public Endpoint(final List<String> addresses,
                    final EndpointConditions conditions,
                    final String hostname,
                    final ObjectReference targetRef,
                    final Map<String, String> topology) {
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

    public String getHostname() {
        return hostname;
    }

    public void setHostname(final String hostname) {
        this.hostname = hostname;
    }

    public ObjectReference getTargetRef() {
        return targetRef;
    }

    public void setTargetRef(final ObjectReference targetRef) {
        this.targetRef = targetRef;
    }

    public Map<String, String> getTopology() {
        return topology;
    }

    public void setTopology(final Map<String, String> topology) {
        this.topology = topology;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                addresses,
                conditions,
                hostname,
                targetRef,
                topology);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Endpoint)) {
            return false;
        }
        final Endpoint __otherCasted = (Endpoint) __other;
        return Objects.equals(addresses, __otherCasted.addresses) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(hostname, __otherCasted.hostname) &&
            Objects.equals(targetRef, __otherCasted.targetRef) &&
            Objects.equals(topology, __otherCasted.topology);
    }

    public Endpoint addresses(final List<String> addresses) {
        this.addresses = addresses;
        return this;
    }

    public Endpoint conditions(final EndpointConditions conditions) {
        this.conditions = conditions;
        return this;
    }

    public Endpoint hostname(final String hostname) {
        this.hostname = hostname;
        return this;
    }

    public Endpoint targetRef(final ObjectReference targetRef) {
        this.targetRef = targetRef;
        return this;
    }

    public Endpoint topology(final Map<String, String> topology) {
        this.topology = topology;
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
