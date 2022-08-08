package io.yupiik.kubernetes.bindings.v1_17_5.v1;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart {
    private StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec;
    private StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet;
    private StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket;

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec,
                                                                                     final StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet,
                                                                                     final StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart __otherCasted = (StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
