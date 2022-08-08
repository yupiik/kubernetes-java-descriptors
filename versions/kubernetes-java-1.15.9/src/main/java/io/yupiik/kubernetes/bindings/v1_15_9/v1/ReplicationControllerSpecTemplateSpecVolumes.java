package io.yupiik.kubernetes.bindings.v1_15_9.v1;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecVolumes {
    private ReplicationControllerSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore;
    private ReplicationControllerSpecTemplateSpecVolumesAzureDisk azureDisk;
    private ReplicationControllerSpecTemplateSpecVolumesAzureFile azureFile;
    private ReplicationControllerSpecTemplateSpecVolumesCephfs cephfs;
    private ReplicationControllerSpecTemplateSpecVolumesCinder cinder;
    private ReplicationControllerSpecTemplateSpecVolumesConfigMap configMap;
    private ReplicationControllerSpecTemplateSpecVolumesCsi csi;
    private ReplicationControllerSpecTemplateSpecVolumesDownwardAPI downwardAPI;
    private ReplicationControllerSpecTemplateSpecVolumesEmptyDir emptyDir;
    private ReplicationControllerSpecTemplateSpecVolumesFc fc;
    private ReplicationControllerSpecTemplateSpecVolumesFlexVolume flexVolume;
    private ReplicationControllerSpecTemplateSpecVolumesFlocker flocker;
    private ReplicationControllerSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk;
    private ReplicationControllerSpecTemplateSpecVolumesGitRepo gitRepo;
    private ReplicationControllerSpecTemplateSpecVolumesGlusterfs glusterfs;
    private ReplicationControllerSpecTemplateSpecVolumesHostPath hostPath;
    private ReplicationControllerSpecTemplateSpecVolumesIscsi iscsi;
    private String name;
    private ReplicationControllerSpecTemplateSpecVolumesNfs nfs;
    private ReplicationControllerSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim;
    private ReplicationControllerSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk;
    private ReplicationControllerSpecTemplateSpecVolumesPortworxVolume portworxVolume;
    private ReplicationControllerSpecTemplateSpecVolumesProjected projected;
    private ReplicationControllerSpecTemplateSpecVolumesQuobyte quobyte;
    private ReplicationControllerSpecTemplateSpecVolumesRbd rbd;
    private ReplicationControllerSpecTemplateSpecVolumesScaleIO scaleIO;
    private ReplicationControllerSpecTemplateSpecVolumesSecret secret;
    private ReplicationControllerSpecTemplateSpecVolumesStorageos storageos;
    private ReplicationControllerSpecTemplateSpecVolumesVsphereVolume vsphereVolume;

    public ReplicationControllerSpecTemplateSpecVolumes() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecVolumes(final ReplicationControllerSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore,
                                                        final ReplicationControllerSpecTemplateSpecVolumesAzureDisk azureDisk,
                                                        final ReplicationControllerSpecTemplateSpecVolumesAzureFile azureFile,
                                                        final ReplicationControllerSpecTemplateSpecVolumesCephfs cephfs,
                                                        final ReplicationControllerSpecTemplateSpecVolumesCinder cinder,
                                                        final ReplicationControllerSpecTemplateSpecVolumesConfigMap configMap,
                                                        final ReplicationControllerSpecTemplateSpecVolumesCsi csi,
                                                        final ReplicationControllerSpecTemplateSpecVolumesDownwardAPI downwardAPI,
                                                        final ReplicationControllerSpecTemplateSpecVolumesEmptyDir emptyDir,
                                                        final ReplicationControllerSpecTemplateSpecVolumesFc fc,
                                                        final ReplicationControllerSpecTemplateSpecVolumesFlexVolume flexVolume,
                                                        final ReplicationControllerSpecTemplateSpecVolumesFlocker flocker,
                                                        final ReplicationControllerSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk,
                                                        final ReplicationControllerSpecTemplateSpecVolumesGitRepo gitRepo,
                                                        final ReplicationControllerSpecTemplateSpecVolumesGlusterfs glusterfs,
                                                        final ReplicationControllerSpecTemplateSpecVolumesHostPath hostPath,
                                                        final ReplicationControllerSpecTemplateSpecVolumesIscsi iscsi,
                                                        final String name,
                                                        final ReplicationControllerSpecTemplateSpecVolumesNfs nfs,
                                                        final ReplicationControllerSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim,
                                                        final ReplicationControllerSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk,
                                                        final ReplicationControllerSpecTemplateSpecVolumesPortworxVolume portworxVolume,
                                                        final ReplicationControllerSpecTemplateSpecVolumesProjected projected,
                                                        final ReplicationControllerSpecTemplateSpecVolumesQuobyte quobyte,
                                                        final ReplicationControllerSpecTemplateSpecVolumesRbd rbd,
                                                        final ReplicationControllerSpecTemplateSpecVolumesScaleIO scaleIO,
                                                        final ReplicationControllerSpecTemplateSpecVolumesSecret secret,
                                                        final ReplicationControllerSpecTemplateSpecVolumesStorageos storageos,
                                                        final ReplicationControllerSpecTemplateSpecVolumesVsphereVolume vsphereVolume) {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecVolumesAwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(final ReplicationControllerSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    public ReplicationControllerSpecTemplateSpecVolumesAzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(final ReplicationControllerSpecTemplateSpecVolumesAzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    public ReplicationControllerSpecTemplateSpecVolumesAzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(final ReplicationControllerSpecTemplateSpecVolumesAzureFile azureFile) {
        this.azureFile = azureFile;
    }

    public ReplicationControllerSpecTemplateSpecVolumesCephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(final ReplicationControllerSpecTemplateSpecVolumesCephfs cephfs) {
        this.cephfs = cephfs;
    }

    public ReplicationControllerSpecTemplateSpecVolumesCinder getCinder() {
        return cinder;
    }

    public void setCinder(final ReplicationControllerSpecTemplateSpecVolumesCinder cinder) {
        this.cinder = cinder;
    }

    public ReplicationControllerSpecTemplateSpecVolumesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final ReplicationControllerSpecTemplateSpecVolumesConfigMap configMap) {
        this.configMap = configMap;
    }

    public ReplicationControllerSpecTemplateSpecVolumesCsi getCsi() {
        return csi;
    }

    public void setCsi(final ReplicationControllerSpecTemplateSpecVolumesCsi csi) {
        this.csi = csi;
    }

    public ReplicationControllerSpecTemplateSpecVolumesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final ReplicationControllerSpecTemplateSpecVolumesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public ReplicationControllerSpecTemplateSpecVolumesEmptyDir getEmptyDir() {
        return emptyDir;
    }

    public void setEmptyDir(final ReplicationControllerSpecTemplateSpecVolumesEmptyDir emptyDir) {
        this.emptyDir = emptyDir;
    }

    public ReplicationControllerSpecTemplateSpecVolumesFc getFc() {
        return fc;
    }

    public void setFc(final ReplicationControllerSpecTemplateSpecVolumesFc fc) {
        this.fc = fc;
    }

    public ReplicationControllerSpecTemplateSpecVolumesFlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(final ReplicationControllerSpecTemplateSpecVolumesFlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    public ReplicationControllerSpecTemplateSpecVolumesFlocker getFlocker() {
        return flocker;
    }

    public void setFlocker(final ReplicationControllerSpecTemplateSpecVolumesFlocker flocker) {
        this.flocker = flocker;
    }

    public ReplicationControllerSpecTemplateSpecVolumesGcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(final ReplicationControllerSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    public ReplicationControllerSpecTemplateSpecVolumesGitRepo getGitRepo() {
        return gitRepo;
    }

    public void setGitRepo(final ReplicationControllerSpecTemplateSpecVolumesGitRepo gitRepo) {
        this.gitRepo = gitRepo;
    }

    public ReplicationControllerSpecTemplateSpecVolumesGlusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(final ReplicationControllerSpecTemplateSpecVolumesGlusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    public ReplicationControllerSpecTemplateSpecVolumesHostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(final ReplicationControllerSpecTemplateSpecVolumesHostPath hostPath) {
        this.hostPath = hostPath;
    }

    public ReplicationControllerSpecTemplateSpecVolumesIscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(final ReplicationControllerSpecTemplateSpecVolumesIscsi iscsi) {
        this.iscsi = iscsi;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public ReplicationControllerSpecTemplateSpecVolumesNfs getNfs() {
        return nfs;
    }

    public void setNfs(final ReplicationControllerSpecTemplateSpecVolumesNfs nfs) {
        this.nfs = nfs;
    }

    public ReplicationControllerSpecTemplateSpecVolumesPersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(final ReplicationControllerSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    public ReplicationControllerSpecTemplateSpecVolumesPhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(final ReplicationControllerSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    public ReplicationControllerSpecTemplateSpecVolumesPortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(final ReplicationControllerSpecTemplateSpecVolumesPortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    public ReplicationControllerSpecTemplateSpecVolumesProjected getProjected() {
        return projected;
    }

    public void setProjected(final ReplicationControllerSpecTemplateSpecVolumesProjected projected) {
        this.projected = projected;
    }

    public ReplicationControllerSpecTemplateSpecVolumesQuobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(final ReplicationControllerSpecTemplateSpecVolumesQuobyte quobyte) {
        this.quobyte = quobyte;
    }

    public ReplicationControllerSpecTemplateSpecVolumesRbd getRbd() {
        return rbd;
    }

    public void setRbd(final ReplicationControllerSpecTemplateSpecVolumesRbd rbd) {
        this.rbd = rbd;
    }

    public ReplicationControllerSpecTemplateSpecVolumesScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(final ReplicationControllerSpecTemplateSpecVolumesScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    public ReplicationControllerSpecTemplateSpecVolumesSecret getSecret() {
        return secret;
    }

    public void setSecret(final ReplicationControllerSpecTemplateSpecVolumesSecret secret) {
        this.secret = secret;
    }

    public ReplicationControllerSpecTemplateSpecVolumesStorageos getStorageos() {
        return storageos;
    }

    public void setStorageos(final ReplicationControllerSpecTemplateSpecVolumesStorageos storageos) {
        this.storageos = storageos;
    }

    public ReplicationControllerSpecTemplateSpecVolumesVsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(final ReplicationControllerSpecTemplateSpecVolumesVsphereVolume vsphereVolume) {
        this.vsphereVolume = vsphereVolume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                awsElasticBlockStore,
                azureDisk,
                azureFile,
                cephfs,
                cinder,
                configMap,
                csi,
                downwardAPI,
                emptyDir,
                fc,
                flexVolume,
                flocker,
                gcePersistentDisk,
                gitRepo,
                glusterfs,
                hostPath,
                iscsi,
                name,
                nfs,
                persistentVolumeClaim,
                photonPersistentDisk,
                portworxVolume,
                projected,
                quobyte,
                rbd,
                scaleIO,
                secret,
                storageos,
                vsphereVolume);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecVolumes)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecVolumes __otherCasted = (ReplicationControllerSpecTemplateSpecVolumes) __other;
        return Objects.equals(awsElasticBlockStore, __otherCasted.awsElasticBlockStore) &&
            Objects.equals(azureDisk, __otherCasted.azureDisk) &&
            Objects.equals(azureFile, __otherCasted.azureFile) &&
            Objects.equals(cephfs, __otherCasted.cephfs) &&
            Objects.equals(cinder, __otherCasted.cinder) &&
            Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(csi, __otherCasted.csi) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(emptyDir, __otherCasted.emptyDir) &&
            Objects.equals(fc, __otherCasted.fc) &&
            Objects.equals(flexVolume, __otherCasted.flexVolume) &&
            Objects.equals(flocker, __otherCasted.flocker) &&
            Objects.equals(gcePersistentDisk, __otherCasted.gcePersistentDisk) &&
            Objects.equals(gitRepo, __otherCasted.gitRepo) &&
            Objects.equals(glusterfs, __otherCasted.glusterfs) &&
            Objects.equals(hostPath, __otherCasted.hostPath) &&
            Objects.equals(iscsi, __otherCasted.iscsi) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(nfs, __otherCasted.nfs) &&
            Objects.equals(persistentVolumeClaim, __otherCasted.persistentVolumeClaim) &&
            Objects.equals(photonPersistentDisk, __otherCasted.photonPersistentDisk) &&
            Objects.equals(portworxVolume, __otherCasted.portworxVolume) &&
            Objects.equals(projected, __otherCasted.projected) &&
            Objects.equals(quobyte, __otherCasted.quobyte) &&
            Objects.equals(rbd, __otherCasted.rbd) &&
            Objects.equals(scaleIO, __otherCasted.scaleIO) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(storageos, __otherCasted.storageos) &&
            Objects.equals(vsphereVolume, __otherCasted.vsphereVolume);
    }
}
