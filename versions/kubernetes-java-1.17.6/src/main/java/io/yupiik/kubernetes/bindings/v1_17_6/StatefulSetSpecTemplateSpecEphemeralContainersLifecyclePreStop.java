package io.yupiik.kubernetes.bindings.v1_17_6;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStop {
    private StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec;
    private StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet;
    private StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket;

    public StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStop() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStop(final StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec,
                                                                          final StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet,
                                                                          final StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStop)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStop __otherCasted = (StatefulSetSpecTemplateSpecEphemeralContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
