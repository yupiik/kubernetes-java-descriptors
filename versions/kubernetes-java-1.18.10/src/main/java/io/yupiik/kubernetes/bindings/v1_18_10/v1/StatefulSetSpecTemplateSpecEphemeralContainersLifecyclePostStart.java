package io.yupiik.kubernetes.bindings.v1_18_10.v1;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStart {
    private StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec;
    private StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet;
    private StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket;

    public StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStart() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStart(final StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec,
                                                                            final StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet,
                                                                            final StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                exec,
                httpGet,
                tcpSocket);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStart)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStart __otherCasted = (StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
