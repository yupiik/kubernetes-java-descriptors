package io.yupiik.kubernetes.bindings.v1_22_9.v1;

import java.util.Objects;

public class PodTemplateTemplateSpecVolumes {
    private PodTemplateTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore;
    private PodTemplateTemplateSpecVolumesAzureDisk azureDisk;
    private PodTemplateTemplateSpecVolumesAzureFile azureFile;
    private PodTemplateTemplateSpecVolumesCephfs cephfs;
    private PodTemplateTemplateSpecVolumesCinder cinder;
    private PodTemplateTemplateSpecVolumesConfigMap configMap;
    private PodTemplateTemplateSpecVolumesCsi csi;
    private PodTemplateTemplateSpecVolumesDownwardAPI downwardAPI;
    private PodTemplateTemplateSpecVolumesEmptyDir emptyDir;
    private PodTemplateTemplateSpecVolumesEphemeral ephemeral;
    private PodTemplateTemplateSpecVolumesFc fc;
    private PodTemplateTemplateSpecVolumesFlexVolume flexVolume;
    private PodTemplateTemplateSpecVolumesFlocker flocker;
    private PodTemplateTemplateSpecVolumesGcePersistentDisk gcePersistentDisk;
    private PodTemplateTemplateSpecVolumesGitRepo gitRepo;
    private PodTemplateTemplateSpecVolumesGlusterfs glusterfs;
    private PodTemplateTemplateSpecVolumesHostPath hostPath;
    private PodTemplateTemplateSpecVolumesIscsi iscsi;
    private String name;
    private PodTemplateTemplateSpecVolumesNfs nfs;
    private PodTemplateTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim;
    private PodTemplateTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk;
    private PodTemplateTemplateSpecVolumesPortworxVolume portworxVolume;
    private PodTemplateTemplateSpecVolumesProjected projected;
    private PodTemplateTemplateSpecVolumesQuobyte quobyte;
    private PodTemplateTemplateSpecVolumesRbd rbd;
    private PodTemplateTemplateSpecVolumesScaleIO scaleIO;
    private PodTemplateTemplateSpecVolumesSecret secret;
    private PodTemplateTemplateSpecVolumesStorageos storageos;
    private PodTemplateTemplateSpecVolumesVsphereVolume vsphereVolume;

    public PodTemplateTemplateSpecVolumes() {
        // no-op
    }

    public PodTemplateTemplateSpecVolumes(final PodTemplateTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore,
                                          final PodTemplateTemplateSpecVolumesAzureDisk azureDisk,
                                          final PodTemplateTemplateSpecVolumesAzureFile azureFile,
                                          final PodTemplateTemplateSpecVolumesCephfs cephfs,
                                          final PodTemplateTemplateSpecVolumesCinder cinder,
                                          final PodTemplateTemplateSpecVolumesConfigMap configMap,
                                          final PodTemplateTemplateSpecVolumesCsi csi,
                                          final PodTemplateTemplateSpecVolumesDownwardAPI downwardAPI,
                                          final PodTemplateTemplateSpecVolumesEmptyDir emptyDir,
                                          final PodTemplateTemplateSpecVolumesEphemeral ephemeral,
                                          final PodTemplateTemplateSpecVolumesFc fc,
                                          final PodTemplateTemplateSpecVolumesFlexVolume flexVolume,
                                          final PodTemplateTemplateSpecVolumesFlocker flocker,
                                          final PodTemplateTemplateSpecVolumesGcePersistentDisk gcePersistentDisk,
                                          final PodTemplateTemplateSpecVolumesGitRepo gitRepo,
                                          final PodTemplateTemplateSpecVolumesGlusterfs glusterfs,
                                          final PodTemplateTemplateSpecVolumesHostPath hostPath,
                                          final PodTemplateTemplateSpecVolumesIscsi iscsi,
                                          final String name,
                                          final PodTemplateTemplateSpecVolumesNfs nfs,
                                          final PodTemplateTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim,
                                          final PodTemplateTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk,
                                          final PodTemplateTemplateSpecVolumesPortworxVolume portworxVolume,
                                          final PodTemplateTemplateSpecVolumesProjected projected,
                                          final PodTemplateTemplateSpecVolumesQuobyte quobyte,
                                          final PodTemplateTemplateSpecVolumesRbd rbd,
                                          final PodTemplateTemplateSpecVolumesScaleIO scaleIO,
                                          final PodTemplateTemplateSpecVolumesSecret secret,
                                          final PodTemplateTemplateSpecVolumesStorageos storageos,
                                          final PodTemplateTemplateSpecVolumesVsphereVolume vsphereVolume) {
        // no-op
    }

    public PodTemplateTemplateSpecVolumesAwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(final PodTemplateTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    public PodTemplateTemplateSpecVolumesAzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(final PodTemplateTemplateSpecVolumesAzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    public PodTemplateTemplateSpecVolumesAzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(final PodTemplateTemplateSpecVolumesAzureFile azureFile) {
        this.azureFile = azureFile;
    }

    public PodTemplateTemplateSpecVolumesCephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(final PodTemplateTemplateSpecVolumesCephfs cephfs) {
        this.cephfs = cephfs;
    }

    public PodTemplateTemplateSpecVolumesCinder getCinder() {
        return cinder;
    }

    public void setCinder(final PodTemplateTemplateSpecVolumesCinder cinder) {
        this.cinder = cinder;
    }

    public PodTemplateTemplateSpecVolumesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final PodTemplateTemplateSpecVolumesConfigMap configMap) {
        this.configMap = configMap;
    }

    public PodTemplateTemplateSpecVolumesCsi getCsi() {
        return csi;
    }

    public void setCsi(final PodTemplateTemplateSpecVolumesCsi csi) {
        this.csi = csi;
    }

    public PodTemplateTemplateSpecVolumesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final PodTemplateTemplateSpecVolumesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public PodTemplateTemplateSpecVolumesEmptyDir getEmptyDir() {
        return emptyDir;
    }

    public void setEmptyDir(final PodTemplateTemplateSpecVolumesEmptyDir emptyDir) {
        this.emptyDir = emptyDir;
    }

    public PodTemplateTemplateSpecVolumesEphemeral getEphemeral() {
        return ephemeral;
    }

    public void setEphemeral(final PodTemplateTemplateSpecVolumesEphemeral ephemeral) {
        this.ephemeral = ephemeral;
    }

    public PodTemplateTemplateSpecVolumesFc getFc() {
        return fc;
    }

    public void setFc(final PodTemplateTemplateSpecVolumesFc fc) {
        this.fc = fc;
    }

    public PodTemplateTemplateSpecVolumesFlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(final PodTemplateTemplateSpecVolumesFlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    public PodTemplateTemplateSpecVolumesFlocker getFlocker() {
        return flocker;
    }

    public void setFlocker(final PodTemplateTemplateSpecVolumesFlocker flocker) {
        this.flocker = flocker;
    }

    public PodTemplateTemplateSpecVolumesGcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(final PodTemplateTemplateSpecVolumesGcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    public PodTemplateTemplateSpecVolumesGitRepo getGitRepo() {
        return gitRepo;
    }

    public void setGitRepo(final PodTemplateTemplateSpecVolumesGitRepo gitRepo) {
        this.gitRepo = gitRepo;
    }

    public PodTemplateTemplateSpecVolumesGlusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(final PodTemplateTemplateSpecVolumesGlusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    public PodTemplateTemplateSpecVolumesHostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(final PodTemplateTemplateSpecVolumesHostPath hostPath) {
        this.hostPath = hostPath;
    }

    public PodTemplateTemplateSpecVolumesIscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(final PodTemplateTemplateSpecVolumesIscsi iscsi) {
        this.iscsi = iscsi;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public PodTemplateTemplateSpecVolumesNfs getNfs() {
        return nfs;
    }

    public void setNfs(final PodTemplateTemplateSpecVolumesNfs nfs) {
        this.nfs = nfs;
    }

    public PodTemplateTemplateSpecVolumesPersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(final PodTemplateTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    public PodTemplateTemplateSpecVolumesPhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(final PodTemplateTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    public PodTemplateTemplateSpecVolumesPortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(final PodTemplateTemplateSpecVolumesPortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    public PodTemplateTemplateSpecVolumesProjected getProjected() {
        return projected;
    }

    public void setProjected(final PodTemplateTemplateSpecVolumesProjected projected) {
        this.projected = projected;
    }

    public PodTemplateTemplateSpecVolumesQuobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(final PodTemplateTemplateSpecVolumesQuobyte quobyte) {
        this.quobyte = quobyte;
    }

    public PodTemplateTemplateSpecVolumesRbd getRbd() {
        return rbd;
    }

    public void setRbd(final PodTemplateTemplateSpecVolumesRbd rbd) {
        this.rbd = rbd;
    }

    public PodTemplateTemplateSpecVolumesScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(final PodTemplateTemplateSpecVolumesScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    public PodTemplateTemplateSpecVolumesSecret getSecret() {
        return secret;
    }

    public void setSecret(final PodTemplateTemplateSpecVolumesSecret secret) {
        this.secret = secret;
    }

    public PodTemplateTemplateSpecVolumesStorageos getStorageos() {
        return storageos;
    }

    public void setStorageos(final PodTemplateTemplateSpecVolumesStorageos storageos) {
        this.storageos = storageos;
    }

    public PodTemplateTemplateSpecVolumesVsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(final PodTemplateTemplateSpecVolumesVsphereVolume vsphereVolume) {
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
                ephemeral,
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
        if (!(__other instanceof PodTemplateTemplateSpecVolumes)) {
            return false;
        }
        final PodTemplateTemplateSpecVolumes __otherCasted = (PodTemplateTemplateSpecVolumes) __other;
        return Objects.equals(awsElasticBlockStore, __otherCasted.awsElasticBlockStore) &&
            Objects.equals(azureDisk, __otherCasted.azureDisk) &&
            Objects.equals(azureFile, __otherCasted.azureFile) &&
            Objects.equals(cephfs, __otherCasted.cephfs) &&
            Objects.equals(cinder, __otherCasted.cinder) &&
            Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(csi, __otherCasted.csi) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(emptyDir, __otherCasted.emptyDir) &&
            Objects.equals(ephemeral, __otherCasted.ephemeral) &&
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
